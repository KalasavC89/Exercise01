package exercise1;

import java.util.Random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 *
 * @author ChintanKalasava
 * @date February 2, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomNumber());
            card.setSuit(Card.SUITS[generateRandomNumberBetween(0, 3)]);
            hand[i] = card;
        }

       
    }

   
    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(13) + 1;
    }

    
    private static int generateRandomNumberBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

   
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is ChintanKalasava");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("Game Developer");

        System.out.println("My hobbies:");
        System.out.println("I like to read Comics");

        System.out.println();
    }
}
