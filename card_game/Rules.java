package card_game;
import behaviours.*;
import java.util.*;

public class Rules {
  String name;
  String deckName;

  public Rules(String name, String deckName) {
    this.name = name;
    this.deckName = deckName;
  }

  public String getName(){
    return this.name;
  }
}