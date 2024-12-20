/**
 * This Class represents a Deck and is meant to
 * show how to write code for larger projects. 
 * 
 * @author TAS
 * @version Dec 2024
 */

import java.util.ArrayList;
import java.util.Collections;

// do NOT change this class!
public class Deck
{
    private ArrayList<Card> cards; // 一疊牌
    private int numDecks; // 幾副牌
    private int currentCard; // 現在用到第幾張

    // constructor
     public Deck(int numDecks)
    {
        cards = new ArrayList<Card>();
        this.numDecks = numDecks;
        initializeDeck();
        currentCard = 0;
    }
 
    // add all 52 cards to the deck and then shuffle it
    public void initializeDeck()
    {
        // generate 52 cards for each deck requested
        for (int d = 0; d < numDecks; d++)
        {
            for(String suit: Card.SUITS)
            {
                for(int i = 1; i<Card.FACES.length; i++)
                {
                    cards.add(new Card(suit,i));
                }
            }
        }
        //shuffle();
    }
    
    // get the deck's size
    public int size()
    {
        return cards.size();
    }
    
    // deal a card (return the top card)
    public Card dealCard()
    {
        // if we reached the end, go back to the beginning
    	if (currentCard >= cards.size()) {
    		currentCard = 0;
    	}
    	
        Card c = cards.get(currentCard);
        currentCard ++;
        return c;
    	//return cards.get(currentCard++);
    }
    
    // use Colletions.shuffle to randomly shuffle the cards
    // and then reset the top card 
    public void shuffle()
    {
    	currentCard = 0;
        Collections.shuffle(cards);
    }
    
    public String toString()
    {
        int i=1;
        // return "currentCard="+ currentCard + ", cards:" + cards;
        String msg="cards: [\n";
        for (Card c : cards)
        {            
            msg += i + ": " + c + "\n";
            i++;
        }
        msg = msg.substring(0, msg.length()-1);
        msg += "\n]";
        return msg;

    }

    public static void main(String[] args) {
        Deck d = new Deck(2);
        
        System.out.println(d);

    }
}