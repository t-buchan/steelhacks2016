import java.util.ArrayList;


//Types of card piles to use
public class Pile{
  
  private ArrayList<Card> pile;
  
  public Pile(){
    pile = new ArrayList<Card>();
  }
  
  public void add(Card card){
    pile.add(card);
  }
  
  public Card draw(){
    Card temp = pile.get(pile.size()-1);
    pile.remove(pile.size()-1);
    return temp;
  }
  
  public String toString(){
    String pileString = new String();
    for(int i = 0; i <= pile.size(); i++){
      pileString += pile.get(i).toString();
    }
    return pileString;
  }
  
}