import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards=new ArrayList < Card >();
    private int arraySize;
    private int cardsLeft;


    public void populate(){
        for(int i = 0; i<4; i++){
            for(int k = 0; k<13; k++){
                Card newCard = new Card (i, k);
                cards.add(newCard);
            }
        }

        arraySize = cards.size();
        cardsLeft = arraySize;

    }


    public void shuffle(){
        ArrayList<Card> newArrayList = new ArrayList<Card>();
        while(cards.size() != 0){
            int pickedCard = (int)(Math.random()*cards.size());
            newArrayList.add(cards.get(pickedCard));
            cards.remove(pickedCard);
        }
        cards = newArrayList;
    }

    public Card removeCard(){
        Card a = null;
        if(cardsLeft !=0){
            a = cards.get(cards.size()-1);
            cards.remove(a);
            cardsLeft = cardsLeft -1;
            return a;
        }
        else{
            return a;
        }
    }

    public Boolean addCard(Card b){
        if(cards.size()<52){
            cards.add(b);
            cardsLeft = cardsLeft + 1;
            return true;
        }
        else{
            return false;
        }
    }


    public int getCardsLeft(){
        return cardsLeft;
    }


}
