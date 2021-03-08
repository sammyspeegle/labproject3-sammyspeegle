import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards=new ArrayList < Card >();
    private int arraySize;
    private int cardsLeft;


    //populate deck with 52 cards
    public void populate(){
        for(int i = 0; i<4; i++){
            for(int k = 0; k<13; k++){
                Card newCard = new Card (k, i);
                cards.add(newCard);
            }
        }

        arraySize = cards.size();
        cardsLeft = arraySize;

    }


    //shuffle cards
    public void shuffle(){
        ArrayList<Card> newArrayList = new ArrayList<Card>();
        while(cards.size() != 0){
            int pickedCard = (int)(Math.random()*cards.size());
            newArrayList.add(cards.get(pickedCard));
            cards.remove(pickedCard);
        }
        cards = newArrayList;
    }

    //remove card
    public Card removeCard(){
        Card removalcard = null;
        if(cardsLeft !=0){
            removalcard = cards.get(cards.size()-1);
            cards.remove(removalcard);
            cardsLeft = cardsLeft -1;
            return removalcard;
        }
        else{
            return removalcard;
        }
    }

    //add card
    public Boolean addCard(Card newcard){
        if(cards.size()<52){
            cards.add(newcard);
            cardsLeft = cardsLeft + 1;
            return true;
        }
        else{
            return false;
        }
    }


    //getting amount of cards left
    public int getCardsLeft(){
        return cardsLeft;
    }


}
