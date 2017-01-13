package card_game;
import behaviours.*;
import java.util.*;

public class Player implements DealtToAble{

  String name;
  ArrayList<DealtToAble> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<DealtToAble>();
  }

  public String getName(){
    return this.name;
  }

  public int countHand(){
    return hand.size();
  }

}