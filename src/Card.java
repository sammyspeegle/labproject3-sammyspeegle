import java.util.Comparator;

public class Card {
    // ranks are ordered Ace-low and Queen-high
    private final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

    // suits are ordered alphabetically
    private final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};


    //declare variables that represent the card number and suit
    private int number;
    private int suit;

    //default constructor
    public Card (){
        number = 0;
        suit = 0;
    }

    //alternate constructor
    public Card (int number, int suit){
        this.number = number;
        this.suit = suit;
    }

    //comparator
    public int Comparator (Card uCard){
        CardComparator comparing = new CardComparator();
        Card computerCard = new Card();
        return comparing.compare(computerCard, uCard);
        }


    //Override to string method
    @Override
    public String toString(){
        return  ranks[number] + " of " + suits[suit];
    }




    //rank to number value
    public int RankToNum(String rank){
        int placing = 0;
        for (int i = 0; i<ranks.length; i++){
            if(rank.equals(ranks[i])){
                placing = i;
            }
        }

        return placing;
    }

    //suit to number value
    public int SuitToNum(String suit){
        int placing = 0;
        for (int i =0; i < suits.length; i++){
            if (suit.equals(suits[i])){
                placing = i;
            }
        }

        return placing;
    }

    //comparator implemented
    class CardComparator implements Comparator<Card>{

        @Override
        public int compare (Card compute, Card use){

            //comparing the cards
            int RankCompare = Integer.compare(compute.RankToNum(compute.ranks[number]), use.RankToNum(use.ranks[number]));
            int SuitCompare = Integer.compare(compute.SuitToNum(compute.suits[suit]), use.SuitToNum(use.suits[suit]));

            if (RankCompare == 0){
                return SuitCompare;
            }
            else {
                return RankCompare;
            }

        }


    }

}


