package card_game;
import behaviours.*;
import java.util.*;

public class Card implements Populatable {  

  String type; //should be enum
  int value; //should be enum to allow for royals?
  String suit;
  

  public Card(String type, int value, String suit) {
    this.type = type;
    this.value = value;
    this.suit = suit; 
  }

  public String getType(){
    return this.type;
  }

  public int getValue(){
    return this.value;
  }

  public String getSuit(){
    return this.suit;
  }


}