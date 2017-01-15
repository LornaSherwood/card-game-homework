package card_game;
import behaviours.*;
import java.util.*;

public class Game {
  String name;
  Rulable rules;
  CanDeal dealer;

  public Game(){
    this.name = name;
    this.rules = rules;
    this.dealer = dealer;
  }

  public void setRules(Rulable rules){
    this.rules = rules;
  }

  public Rulable hasRules(){
    return this.rules;
  }

  public void setDealer(Rulable rules){
    this.dealer = rules.getDealer();
  }

  public CanDeal hasDealer(){
    return this.dealer;
  }

  public void dealerDealStartHand(){
    int handSize = rules.getStartHand();
    dealer.dealStartHand(handSize);
  }

  /*public ArrayList getValueOfCards(){
    array = valueofcards for each player in players
  }*/




}

