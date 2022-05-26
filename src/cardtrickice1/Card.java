/*
    Name: Pizaan Tadiwala
 */

package cardtrickice1;

/** define card value and suits
 * 
 *
 *
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    public Card(int value, String suits){
        this.value = value;
        this.suits = suits;
    }
    
    public String toString(){
        return value + " of " + suits;
    }    
}
