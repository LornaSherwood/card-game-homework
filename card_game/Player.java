package card_game;
import behaviours.*;
import java.util.*;

public class Player implements DealtToAble{

  String name;
  ArrayList<Populatable> hand; 


  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Populatable>();
  }

  public String getName(){
    return this.name;
  }

  public int countHand(){
    return hand.size();
  }

  public void addCardToHand(Populatable card){
    hand.add(card);
  }

  public int getValueOfHand(){
    int i = 0;
    for (Populatable card : hand){
      i += card.getValue();
    }
    return i;
  }


  //public int getTotalValue(){

  //}

}