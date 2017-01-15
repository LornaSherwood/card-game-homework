import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest {

  Dealer dealer;
  Player player;
  Deck deck;
  Deck deck1;
  Card card;


  @Before
  public void before(){
    dealer = new Dealer();
    player = new Player("Rory");
    deck = new Deck("Standard", 52);
    deck1 = new Deck("Uno", 45);
    card = new Card("Standard", 3, "Hearts");
    
  }

  @Test
  public void startsWithNoDeck(){
    assertEquals(null, dealer.hasDeck());
}

  @Test
  public void canSetDeck(){
    dealer.setDeck(deck1);
    assertEquals(deck1, dealer.hasDeck());
  }

  @Test
  public void hasDeck(){
    dealer.setDeck(deck);
    assertEquals(deck, dealer.hasDeck());
  }

  @Test
  public void canGetPlayer(){
    dealer.getPlayer(player);
    assertEquals(1, dealer.countPlayers());
  }

  @Test
  public void canShowPlayer(){
    dealer.getPlayer(player);
    assertEquals(player, dealer.showPlayer(0));
  }

  @Test
  public void canGetCard(){
    deck.getCard(card);
    dealer.setDeck(deck);
    assertEquals(card, dealer.getCard()); //return a card
    assertEquals(0, deck.packCount()); //deck is empty
  }

  @Test
  public void canDealCard(){
    deck.getCard(card); // make sure deck has one card
    dealer.setDeck(deck); // dealer sets deck
    dealer.getPlayer(player); //put one player into players array
    dealer.dealCard(player);
    assertEquals(1, player.countHand());//player has one more card
    assertEquals(0, deck.packCount()); //deck has one less card
  }

  @Test
  public void canDealStartHand(){
    deck.getCard(card); // make sure deck has one card
    dealer.setDeck(deck); // dealer sets deck
    dealer.getPlayer(player);//put one player into players array
    dealer.dealStartHand(1);
    assertEquals(1, player.countHand());
  }






}