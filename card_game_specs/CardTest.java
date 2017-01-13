import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest {

  Card card;
  
  @Before
  public void before(){
    card = new Card("Standard", 3, "Hearts");
  }

  @Test
  public void canGetType(){
    assertEquals("Standard", card.getType());
  }

  @Test
  public void canGetValue(){
    assertEquals(3, card.getValue());
  }

  @Test
  public void canGetSuit(){
    assertEquals("Hearts", card.getSuit());
  }

}

