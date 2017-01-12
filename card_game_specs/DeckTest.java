import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest {

  Deck deck;

  @Before
  public void before(){
    deck = new Deck(52);
  }

  @Test
  public void canGetTotalNumber(){
    assertEquals(52, deck.getTotalNumber());
  }

}