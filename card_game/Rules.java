package card_game;
import behaviours.*;
import java.util.*;

public class Rules implements Rulable{
  String name;
  String deckName;
  CanDeal dealer;
  int startHand;

  public Rules(String name, String deckName, CanDeal dealer, int startHand) {
    this.name = name;
    this.deckName = deckName;
    this.dealer = dealer;
    this.startHand = startHand;
  }

  public String getName(){
    return this.name;
  }

  public CanDeal getDealer(){
    return this.dealer;
  }

  public int getStartHand(){
    return this.startHand;
  }
}