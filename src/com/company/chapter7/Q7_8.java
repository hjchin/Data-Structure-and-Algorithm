package com.company.chapter7;

public class Q7_8 {

    class Game{

        Board board;
        Player player1;
        Player player2;
        Turn nextTurn;
        Presenter presenter;

        Game(Presenter presenter,
             Board board,
             Player player1,
             Player player2){
            this.presenter = presenter;
            this.board = board;
            this.player1 = player1;
            this.player2 = player2;
            nextTurn = new Turn(player1);
        }

        void place(Player player, Board.Coordinate coordinate){

            if(nextTurn.player != player){
                presenter.showMessage("It is Player "+nextTurn.player.name+"'s turn");
                return;
            }

            if(!board.isGridEmpty(coordinate)){
                presenter.showMessage("not allow to place Othello");
                return;
            }
            
            board.placeOthello(coordinate, new Board.Othello(player.othelloFace));
            calculateNewState();

            if(board.isFull()){
                String message = "It is a draw";

                if(player1.numberofOthello > player2.numberofOthello){
                    message = "winner is Player "+player1.name;
                }else if(player2.numberofOthello > player1.numberofOthello){
                    message = "winner is Player "+player2.name;
                }

                presenter.showMessage("board is full. "+message);

            }else{
                nextTurn.player = nextTurn.player == player1? player2: player1;
            }
        }

        Turn getNextTurn(){
            return nextTurn;
        }

        void calculateNewState(){

        }
    }



    abstract class Presenter{
        abstract void showMessage(String message);
    }

    enum OthelloFace{
        WHITE,
        BLACK
    }

    static class Board{

        static final int width = 16;
        Othello[][] board = new Othello[width][width];
        int emptyGrid = 16 * 16;

        Board(){}

        boolean isFull(){
            return emptyGrid == 0;
        }


        boolean isGridEmpty(Coordinate coordinate){
            return board[coordinate.x][coordinate.y] == null;
        }

        void placeOthello(Coordinate coordinate, Othello othello){
            emptyGrid--;
        }

        static class Othello{
            OthelloFace faceValue;
            Othello(OthelloFace faceValue){
                this.faceValue = faceValue;
            }
        }

        static class Coordinate{

            int x;
            int y;

            Coordinate(int x, int y){
                if(x<0 || x>Board.width-1) throw new IndexOutOfBoundsException();
                if(y<0 || y>Board.width-1) throw new IndexOutOfBoundsException();
            }
        }
    }

    class Player{
        String name;
        int numberofOthello;
        OthelloFace othelloFace;
    }

    class Turn{
        Player player;
        Turn (Player player){
            this.player = player;
        }
    }
}
