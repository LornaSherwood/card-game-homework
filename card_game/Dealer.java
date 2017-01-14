package card_game;
import behaviours.*;
import java.util.*;

public class Dealer {
  ArrayList<DealtToAble> players; // array of dealt to able players called players
  Dealable deck;

  public Dealer(){
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

  public DealtToAble showPlayer(int index){ 
    return players.get(index);
  }

  public int countPlayers(){
    return players.size();
  }

  public Populatable getCard(){ // turn Dealable deck back into Deck deck
    Deck returnedDeck = (Deck) deck;
    return returnedDeck.removeCard(0); // remove the card at index 0
  }
  
  public void dealCard(DealtToAble player){ // say which card (set as 'top') and to which player.
    Populatable topCard = deck.removeCard(0);
    player.addCardToHand(topCard);
  }


}