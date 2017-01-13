import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest {

  Player player;
  Deck deck;

  @Before
  public void before(){
    player = new Player("Rory");
    deck = new Deck("Standard", 52);
  }


}