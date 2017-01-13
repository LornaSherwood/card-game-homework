import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck("Standard", 52);
    card = new Card("Standard", 3, "Hearts");
  }

  @Test 
  public void canGetName(){
    assertEquals("Standard", deck.getName());
  }

  @Test
  public void canGetTotalNumber(){
    assertEquals(52, deck.getTotalNumber());
  }

  @Test
  public void packStartsEmpty(){
    assertEquals(0, deck.packCount());
  }

  @Test
  public void canGetCard(){
    deck.getCard(card);
    assertEquals(1, deck.packCount());
  }

  @Test
  public void canShowCard(){
    deck.getCard(card); //populate array with one card
    assertEquals(card, deck.showCard(0)); //return card at index 0
  }

}