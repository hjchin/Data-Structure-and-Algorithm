package com.company.chapter7;

import sun.misc.Queue;

import java.util.ArrayList;
import java.util.Stack;

public class Q7_6 {

    enum Edge{
        NEGATIVE(-1),
        POSITIVE(1),
        FLAT(0);

        int edgeValue;

        Edge(int edgeValue){
            this.edgeValue = edgeValue;
        }
    }

    class Puzzle{
        Edge leftEdge;
        Edge topEdge;
        Edge rightEdge;
        Edge bottomEdge;
        Puzzle leftPuzzle;
        Puzzle topPuzzle;
        Puzzle rightPuzzle;
        Puzzle bottomPuzzle;
    }

    class PuzzleSolver{

        Queue<Puzzle> puzzleCollections;

        PuzzleSolver(Queue<Puzzle> collections){
            this.puzzleCollections = collections;
        }

        void solve(){

            try {
                Puzzle puzzle = puzzleCollections.dequeue();
                while(!puzzleCollections.isEmpty()) {
                    Puzzle nextPuzzle = puzzleCollections.dequeue();
                    boolean attached = attachNeigbour(puzzle, nextPuzzle);
                    if (attached) {
                        puzzle = nextPuzzle;
                    }else{
                        puzzleCollections.enqueue(nextPuzzle);
                    }
                }
            } catch (InterruptedException e) {

            }

        }

        boolean attachNeigbour(Puzzle p1, Puzzle p2){
            boolean fit = fitWith(p1.rightEdge, p2.leftEdge);
            if(fit){
                p1.rightPuzzle = p2;
                p2.leftPuzzle = p1;
                return true;
            }

            fit = fitWith(p1.leftEdge, p2.rightEdge);
            if(fit){
                p1.leftPuzzle = p2;
                p2.rightPuzzle = p1;
                return true;
            }

            fit = fitWith(p1.bottomEdge, p2.topEdge);
            if(fit){
                p1.bottomPuzzle = p2;
                p2.topPuzzle = p1;
                return true;
            }

            fit = fitWith(p1.topEdge, p2.bottomEdge);
            if(fit){
                p1.topPuzzle = p2;
                p2.bottomPuzzle = p1;
                return true;
            }

            return false;
        }

        boolean fitWith(Edge puzzle1Edge, Edge puzzle2Edge){
            if(puzzle1Edge == Edge.FLAT || puzzle2Edge == Edge.FLAT) return false;
            return puzzle1Edge.edgeValue+puzzle2Edge.edgeValue == 0; //plus other criteria
        }
    }


}
