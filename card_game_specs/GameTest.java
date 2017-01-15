import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class GameTest {
  Game game;
  Dealer dealer;
  Rules rules;
  Player player;
  Deck deck;
  Card card;

  @Before
  public void before(){
    game = new Game();
    dealer = new Dealer();// order matters here! why?
    rules = new Rules("A", "Standard", dealer, 1); 
    player = new Player("Jez");
    deck = new Deck("Standard", 52);
    card = new Card("Q", 10, "Spades");
  }

  @Test
  public void rulesStartsNull(){
    assertEquals(null, game.hasRules());
  }

  @Test
  public void canSetRules(){
    game.setRules(rules);
    assertEquals(rules, game.hasRules());
  }

  @Test
  public void dealerStartsNull(){
    assertEquals(null, game.hasDealer());
  }

  @Test
  public void canSetDealer(){
    game.setDealer(rules);
    assertEquals(dealer, game.hasDealer());
  }

  @Test
  public void canGetStartHand(){
    game.setRules(rules);
    assertEquals(1, rules.getStartHand());
  }

  @Test
  public void canCountHand(){
    game.setRules(rules);
    game.setDealer(rules);
    dealer.getPlayer(player);
    dealer.setDeck(deck);
    deck.getCard(card);
    dealer.dealCard(player);
    assertEquals(1, player.countHand());
  }

  @Test
  public void canTellDealerDealStartHand(){
    game.setRules(rules);
    game.setDealer(rules);
    dealer.getPlayer(player);
    dealer.setDeck(deck);
    deck.getCard(card);
    game.dealerDealStartHand();
    assertEquals(1, player.countHand());
  }

  


}