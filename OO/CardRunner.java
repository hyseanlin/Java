package OO;

public class CardRunner {
    public static void main(String[] args) {
        // // 建立一張牌的範例(Ace, Club)
        // Card c1 = new Card(Card.SUITS[0], 1);
        // System.out.println(c1);

        Card[] deck = new Card[52];

        int i=0;
        for (String suit : Card.SUITS) // for each suit
        {
            for (int face=1; face<=13; face++) // for each face
            {
                Card c = new Card(suit, face);
                deck[i] = c;
                i++;
            }
        }

        for (Card card : deck)
            System.out.println(card);

    }
}
