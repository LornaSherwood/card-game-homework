package card_game;
import behaviours.*;
import java.util.*;

public class Game {
  private String name;
  Rulable rules;
  CanDeal dealer;
  ArrayList<Integer> scoreSheet;
  

  public Game(){
    this.name = name;
    this.rules = rules;
    this.dealer = dealer;
    scoreSheet = new ArrayList<Integer>();
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

  public ArrayList<Integer> getScoreSheet(){
    ArrayList<DealtToAble> newPlayers = new ArrayList<>(dealer.getPlayers());
    ArrayList<Integer> scoreSheet = new ArrayList<Integer>();
    for (DealtToAble player : newPlayers){
      scoreSheet.add(player.getValueOfHand());
    }
    return scoreSheet;
  }

 
  //public DealtToAble findHighestScorer(){


  //}






}

