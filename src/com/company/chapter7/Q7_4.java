package com.company.chapter7;

public class Q7_4 {

    static class ParkingLot{
        int emptyLot = 50;
        Terminal terminal;

        ParkingLot(Terminal terminal){
            this.terminal = terminal;
        }

        void getAcceptance(){
            if(emptyLot == 0){
                terminal.show("Car Park full");
                return;
            }
            terminal.issueTicket();
            terminal.openGate();
            emptyLot--;
        }

        void releaseCar(){
            terminal.openGate();
            emptyLot++;
        }
    }


    static class Ticket{
        long timestemp = System.currentTimeMillis();
    }

    abstract class Terminal{
        void show(String message){}
        void openGate(){}
        abstract Ticket issueTicket();
    }

}
