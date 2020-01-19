package com.company.chapter7;

import java.util.ArrayList;

public class Q7_3 {

    static class JukeBox{

        private Player player;

        JukeBox(Player player){
            this.player = player;
        }

        ArrayList<Record> records = new ArrayList<>();
        Record selectedRecord;

        void addRecord(Record record){
            records.add(record);
        }

        void playRecord(){
            if(selectedRecord != null){
                player.play(selectedRecord);
            }
        }

        ArrayList<Record> search(String keyword){
            ArrayList<Record> selection = new ArrayList<>();

            for(Record r: records){
                if(r.keyword.contains(keyword)){
                    selection.add(r);
                }
            }

            return selection;
        }

        void selectRecord(Record record){
            selectedRecord = record;
        }

    }

    static class Record{
        String keyword;
    }

    static class Player{
        void play(Record record){

        }
    }
}
