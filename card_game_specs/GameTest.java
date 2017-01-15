import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class GameTest {
  Game game;
  Dealer dealer;
  Rules rules;
  Player player;
  Player player2;
  Deck deck;
  Card card;
  Card card2;
  

  @Before
  public void before(){
    game = new Game();
    dealer = new Dealer();// order matters here! why?
    rules = new Rules("A", "Standard", dealer, 1); 
    player = new Player("Jez");
    player = new Player("Misty");
    deck = new Deck("Standard", 52);
    card = new Card("Q", 10, "Spades");
    card2 = new Card("", 2, "Hearts");
    
    
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
    dealer.addPlayer(player);
    dealer.setDeck(deck);
    deck.getCard(card);
    dealer.dealCard(player);
    assertEquals(1, player.countHand());
  }

  @Test
  public void canTellDealerDealStartHand(){
    game.setRules(rules);
    game.setDealer(rules);
    dealer.addPlayer(player);
    dealer.setDeck(deck);
    deck.getCard(card);
    game.dealerDealStartHand();
    assertEquals(1, player.countHand());
  }

 /* @Test 
  public void canGetScoreSheet(){
    game.setRules(rules);
    game.setDealer(rules);
    dealer.addPlayer(player);
    dealer.addPlayer(player);
    dealer.setDeck(deck);
    deck.getCard(card);
    game.dealerDealStartHand();
    

    game.getScoreSheet();
    assertArrayEquals(, );

  }*/





}