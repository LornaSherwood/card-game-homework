package card_game;
import behaviours.*;
import java.util.*;

public class Player implements DealtToAble, Populatable{

  String name;
  ArrayList<Populatable> hand;
  Populatable card;

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

}