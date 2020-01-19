package com.company.chapter7;

public class Q7_1 {

    enum Suit {
        CLUB,
        SPADE,
        HEART,
        DIAMOND
    }

    static abstract class BaseCard{
        protected int value;
        protected Suit suit;

        BaseCard(int value, Suit suit){
            this.value = value;
            this.suit = suit;
        }

        public int getValue(){
            return  value;
        }

        public Suit getSuit(){
            return suit;
        }
    }

    static class CardAce extends BaseCard {

        static CardAce create(Suit suit){
            return new CardAce(1, suit);
        }

        private CardAce(int value, Suit suit) {
            super(value, suit);
        }

        public void setMin(){
            value = 1;
        }

        public void setMax(){
            value = 10;
        }
    }

    static class Card1 extends BaseCard{

        static Card1 create(Suit suit){
            return new Card1(1, suit);
        }

        private Card1(int value, Suit suit) {
            super(value, suit);
        }
    }

    static class Card10 extends BaseCard{

        static Card10 create(Suit suit){
            return new Card10(10, suit);
        }

        private Card10(int value, Suit suit) {
            super(value, suit);
        }
    }

    static class Cardjack extends BaseCard{

        static Cardjack create(Suit suit){
            return new Cardjack(10, suit);
        }

        private Cardjack(int value, Suit suit) {
            super(value, suit);
        }
    }

    static class CardQuean extends BaseCard{

        static CardQuean create(Suit suit){
            return new CardQuean(10, suit);
        }

        private CardQuean(int value, Suit suit) {
            super(value, suit);
        }
    }


    static class CardKing extends BaseCard{

        static CardKing create(Suit suit){
            return new CardKing(10, suit);
        }

        private CardKing(int value, Suit suit) {
            super(value, suit);
        }
    }
}
