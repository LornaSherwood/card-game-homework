import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

  Player player;
  Card card;

  @Before
  public void before(){
    player = new Player("Rory");
    card = new Card(5, "spades");
  }

  @Test
  public void canGetName(){
    assertEquals("Rory", player.getName());
  }
}
