import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest {

  Dealer dealer;
  Player player;
  Deck deck;
  Deck deck1;


  @Before
  public void before(){
    dealer = new Dealer();
    player = new Player("Rory");
    deck = new Deck("Standard", 52);
    deck1 = new Deck("Uno", 45);
    
  }

  @Test
  public void startsWithNoDeck(){
  assertEquals(null, dealer.getDeck());
}

  @Test
  public void canSetDeck(){
    dealer.setDeck(deck1);
    assertEquals(deck1, dealer.getDeck());
  }

  /*@Test
  public void canDealCard(){

  }*/


}