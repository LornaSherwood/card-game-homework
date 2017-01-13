package card_game;
import behaviours.*;
import java.util.*;

public class Dealer implements DealtToAble {
  Deck deck;
  ArrayList<DealtToAble> players; // array of dealt to able players called players

  public Dealer(){
    this.players = new ArrayList<DealtToAble>();
  }

  public void setDeck(Deck deck){
    this.deck = deck;
  }

  public Deck getDeck(){
    return this.deck;
  }



}