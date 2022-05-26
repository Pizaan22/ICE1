/*
    Name: Pizaan Tadiwala
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
        
        //step 1: generate 7 random cards and store in an array
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card((int) (Math.random() * 14), Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        //step 2:take input 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the following details to see if the card you choose "
                + "exists among the random 7 :");
        System.out.print("Suit: ");
        String inpSuit = scn.nextLine().toLowerCase();

        System.out.print("Rank: ");
        String inpRank = scn.nextLine();

        String userInp = inpRank + " of " + inpSuit;

        //step 3: match with array 
        String output = "card not found";
        for (Card card : magicHand) {
            if (userInp.equals(card.toString())) {
                output = "card is found";
                break;
            }
        }
        System.out.println(output);
    }
}
