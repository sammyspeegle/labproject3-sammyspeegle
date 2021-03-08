import java.util.Comparator;

public class Card {
    // ranks are ordered Ace-low and Queen-high
    private final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

// suits are ordered alphabetically
    private final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};


    private int number;
    private int suit;

    public Card (){
        number = 0;
        suit = 0;
    }

    public Card (int number, int suit){
        this.number = number;
        this.suit = suit;
    }

    public int Comparator (Card uCard){
        CardComparator cp = new CardComparator();
        Card comCard = new Card();
        return cp.compare(comCard, uCard);

        }


    //Override to string method
    @Override
    public String toString(){
        return ranks[number] + " of " + suits[suit];
    }

    public String getRank(){
        return ranks[number];
    }

    public String getSuit(){
        return suits[suit];
    }


    //fix
    public int Ranktonumber(String b){
        int a = 0;
        for (int i = 0; i<ranks.length; i++){
            if(b.equals(ranks[i])){
                a = i;
            }
        }

        return a;
    }

    public int Suittonumber(String c){
        int a = 0;
        for (int i =0; i < suits.length; i++){
            if (c.equals(suits[i])){
                a = i;
            }
        }

        return a;
    }

    class CardComparator implements Comparator<Card>{

        public int compare (Card com, Card user){
            int RankingCompare = Integer.compare(com.Ranktonumber(com.getRank()), user.Ranktonumber(user.getRank()));
            int SuitCompare = Integer.compare(com.Suittonumber(com.getSuit()), user.Suittonumber(user.getSuit()));

            if (RankingCompare == 0){
                return SuitCompare;
            }
            else {
                return RankingCompare;
            }

        }


    }

}


