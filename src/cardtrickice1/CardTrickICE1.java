/*
    Name: Pizaan Tadiwala
    Student ID: 991638701
*/

package cardtrickice1;

import java.util.Scanner;

/*
 * step 1: generate 7 random cards and store in an array 
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 */
public class CardTrickICE1 {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7]; //Array of object
        Card luckyCard = new Card(0,"spades"); //Card object added from GitHub
        
        //step 1: generate 7 random cards and store in an array
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card((int)((Math.random() * 12) + 1), Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        //step 2:take input 
        Scanner scn = new Scanner(System.in);
        System.out.println("Please choose the suit: \n1: Hearts \n2: Diamonds"
        + "\n3: Spades \n4: Clubs");
        System.out.print("Suit: ");
        int inpSuitNum = scn.nextInt();
        String inpSuit;

        switch (inpSuitNum) {
            case 1:
                inpSuit = "hearts";
                break;
            case 2:
                inpSuit = "diamonds";
                break;
            case 3:
                inpSuit = "spades";
                break;
            case 4:
                inpSuit = "clubs";
                break;
            default: 
                inpSuit = "";
                break;
        }

        System.out.print("Please choose the value (1 to 12) : ");
        String inpRank = scn.next();

        String userInp = inpRank + " of " + inpSuit;

        //step 3: match with array 
        String output = "Sorry, no match.";
        for (Card card : magicHand) {
            if (userInp.equals(card.toString())) {
                output = "Card is found.";
                break;
            }
        }
        System.out.println(output);
    }
}
