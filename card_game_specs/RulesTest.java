import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class RulesTest {

  Rules rules;
  Dealer dealer;
 


  @Before
  public void before(){
    rules = new Rules("A", "Standard", dealer, 1);
    
  }

  @Test
  public void canGetName(){
    assertEquals("A", rules.getName());
  }

  @Test
  public void canGetDealer(){
    assertEquals(dealer, rules.getDealer());
  }

  @Test
  public void canGetStartHand(){
    assertEquals(1, rules.getStartHand());
  }






}