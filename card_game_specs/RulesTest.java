import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class RulesTest {

  Rules rules;
  Game game;


  @Before
  public void before(){
    rules = new Rules("A", "Standard");
    game = new Game();
  }

  @Test
  public void canGetName(){
    assertEquals("A", rules.getName());
  }





}