package by.itacademy.tasks03;

import java.util.Random;

/**
 * Created by Evgeni on 16.06.17.
 */
public class Task37 {
    public static void main(String[] args) {
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();
    randomCard();


    }

    public static void randomCard() {
        String[] cardDeckNum = new String[13];
        String[] cardDeckSuit = new String[4];


        cardDeckNum[0] = "2";
        cardDeckNum[1] = "3";
        cardDeckNum[2] = "4";
        cardDeckNum[3] = "5";
        cardDeckNum[4] = "6";
        cardDeckNum[5] = "7";
        cardDeckNum[6] = "8";
        cardDeckNum[7] = "9";
        cardDeckNum[8] = "10";
        cardDeckNum[9] = "Jack";
        cardDeckNum[10] = "Queen";
        cardDeckNum[11] = "King";
        cardDeckNum[12] = "Ace";

        cardDeckSuit[0] = "Spades";
        cardDeckSuit[1] = "Hearts";
        cardDeckSuit[2] = "Clubs";
        cardDeckSuit[3] = "Diamonds";

        int randomCard;
        int randomSuit;
        Random random = new Random();
        randomSuit = random.nextInt(4) + 0;
        randomCard = random.nextInt(13) + 0;

        System.out.println(cardDeckNum[randomCard]+" of "+ cardDeckSuit[randomSuit]);
    }
}
