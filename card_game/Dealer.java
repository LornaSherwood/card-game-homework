package card_game;
import behaviours.*;
import java.util.*;

public class Dealer {
  Deck deck;
  ArrayList<DealtToAble> players; // array of dealt to able players called players


  public Dealer(){
    this.deck = new Deck("Standard", 52);
    this.players = new ArrayList<DealtToAble>();
  }


}