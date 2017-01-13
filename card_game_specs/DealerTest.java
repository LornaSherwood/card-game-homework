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
    assertEquals(deck, dealer.hasDeck());

  }

  @Test
  public void canGetPlayer(){
    dealer.getPlayer(player);
    assertEquals(1, dealer.countPlayers());
  }

  @Test
  public void canGetCard(){
    assertEquals(card, dealer.getCard());
  }


/*
@Test
  public void canDealCard(){

    deck.getCard(card);
    dealer.setDeck(deck);
    dealer.getPlayer(player);
    dealer.dealCard(card);
    assertEquals(0, deck.packCount());
    assertEquals(1, player.countHand());
  }*/


}