package card_game;
import behaviours.*;
import java.util.*;

public class Dealer {
  private String name;
  ArrayList<DealtToAble> players; // array of dealt to able players called players
  Dealable deck;

  public Dealer(){
    this.name = name;
    this.players = new ArrayList<DealtToAble>();
    this.deck = deck;
  }

  public void setDeck(Dealable deck){
    this.deck = deck;
  }

  public Dealable hasDeck(){
    return this.deck;
  }

  public void getPlayer(DealtToAble player){
    players.add(player);
  }

  public int countPlayers(){
    return players.size();
  }

  public Populatable getCard(){
    Deck returnedDeck = (Deck) deck;
    return returnedDeck.showCard(0);
    
  }

  /*public void dealCard(){
    DealtToAble.hand.add(Dealable.pack.remove(0)); // take card from deck, put card in player hand 
  }*/


}