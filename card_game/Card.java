package card_game;
import behaviours.*;
import java.util.*;

public class Card implements Populatable{

  int value; //should be enum to allow for royals?
  String suit;

  public Card(int value, String suit) {
    this.value = value;
    this.suit = suit;
  }


}