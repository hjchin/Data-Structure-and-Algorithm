package com.company.chapter7;

import java.awt.*;

public class Q7_7 {

    /*
    Chat Server: Explain how you would design a chat server. In particular, provide details about the
    various backend components, classes, and methods. What would be the hardest problems to solve?

     */

    class ChatServer{

        ChatServerRepository repository;
        MessageDispatcher messageDispatcher;
        MessageReceiver messageReceiver;

        boolean isRunning = false;

        ChatServer(MessageReceiver messageReceiver,
                   ChatServerRepository repository,
                   MessageDispatcher messageDispatcher){
            this.messageReceiver = messageReceiver;
            this.repository = repository;
            this.messageDispatcher = messageDispatcher;
        }

        void start(){
            isRunning = true;
            Thread worker = new Thread(){
                @Override
                public void run(){
                    while(isRunning && messageReceiver.isConnectionOpen()){
                        Message msg = messageReceiver.getNextMessage();
                        if(msg.state == Q7_7.State.NEW){
                            repository.add(msg);
                        }

                        if(msg.state == Q7_7.State.UPDATE_STATUS){
                            repository.update(msg);
                        }

                        messageDispatcher.enqueue(msg);
                    }
                }
            };
            worker.start();
        }

        void shut(){
            isRunning = false;
        }
    }

    abstract class MessageDispatcher{
        abstract void enqueue(Message message);
        abstract void dispatch(Message message);
    }

    abstract class MessageReceiver{
        abstract boolean isConnectionOpen();
        abstract Message getNextMessage();
    }

    abstract class ChatServerRepository{
        abstract void add(Message message);
        abstract void update(Message message);
    }

    class ChatClient {

        Presenter presenter;
        Repository repository;
        boolean isOpen = false;

        ChatClient(Presenter presenter, Repository repository){
            this.presenter = presenter;
            this.repository = repository;
        }

        void sendMessage(Message msg){
            repository.add(msg);
            presenter.showNextMessage(msg);
        }

        private void receiveMessage(){
            Thread receiver = new Thread(){
                public void run(){
                    while(isOpen){
                        Message message = repository.getMessage();
                        if(message.state == Q7_7.State.NEW){
                            presenter.showNextMessage(message);
                        }else if(message.state == Q7_7.State.UPDATE_STATUS){
                            presenter.refreshMessage(message);
                        }
                    }
                }
            };
            receiver.start();
        }

        void readMessage(Message message){
           message.status = Status.READ;
           message.state = State.UPDATE_STATUS;
           repository.update(message);
        }

        void loadMessage(){
            receiveMessage();
        }

        void open(){
            isOpen = true;
            repository.syncTime(System.currentTimeMillis());
            receiveMessage();
        }

        void close(){
            isOpen = false;
        }
    }

    abstract class Presenter{
        abstract void showNextMessage(Message message);
        abstract void markMessageRead(Message message);
        abstract void refreshMessage(Message message);
    }

    abstract class Repository{
        abstract void add(Message message);
        abstract void update(Message message);
        abstract Message getMessage();
        abstract void syncTime(long timestamp);
    }

    class Account{
        String name;
        Image avatar;
    }

    class Message{
        Account sender;
        Account recipient;
        long timeStamp;
        Status status;
        Message nextMessage;
        State state;
    }

    enum Status{
        SENT,
        RECEIVED,
        READ
    }

    enum State{
        NEW,
        UPDATE_STATUS
    }
}
