package com.company.chapter7;

public class Q7_10 {

    class Minesweeper{

        private Board board;
        private Board.Grid[][] grid;
        private int unearthBombCount = 0;
        private Presenter presenter;
        private boolean gameEnd = false;

        Minesweeper(Presenter presenter, Board board){
            this.presenter = presenter;
            this.board = board;
            grid = new Board.Grid[board.getSize()][board.getSize()];
        }

        void resetGame(){
            populateMine();
        }

        private void populateMine(){
            unearthBombCount = 10;
        }

        void markBomb(int x,int y){
            if(grid[x][y] instanceof Board.Bomb){
                unearthBombCount--;
            }
        }

        void openGrid(int x, int y){
            if(grid[x][y] instanceof Board.Bomb){
                presenter.showMessage();
                gameEnd = true;
            }
        }
        
        int getUnearthBombCount(){
            return unearthBombCount;
        }
    }

    abstract class Presenter{
        abstract void markBomb(Q7_8.Board.Coordinate coordinate);
        abstract void open(Board.Coordinate coordinate);
        abstract void clear(Board.Coordinate coordinate);
        abstract void reset();
        abstract void showMessage();
    }

    abstract class Board{
        abstract int getSize();

        abstract class Coordinate{
            int x,y;
        }

        abstract class Grid{
            int value;
        }

        abstract class Mask extends Grid{ }
        abstract class BombCount extends Grid{ }
        abstract class Bomb extends Grid{ }
    }


}
