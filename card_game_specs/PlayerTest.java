import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

  Player player;
  Card card;
  

  @Before
  public void before(){
    player = new Player("Jez");
    card = new Card("Standard", 5, "spades");
  }

  @Test
  public void canGetName(){
    assertEquals("Jez", player.getName());
  }

  @Test
  public void handStartsEmpty(){
    assertEquals(0, player.countHand());
  }

}
