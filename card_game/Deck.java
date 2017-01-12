package card_game;
import behaviours.*;
import java.util.*;


public class Deck  {
  int totalNumber;
  ArrayList<Populatable> pack; // array of populatable cards called pack

  public Deck(int totalNumber) {
    this.totalNumber = totalNumber;
    this.pack = new ArrayList<Populatable>();
  }

  public int getTotalNumber(){
    return this.totalNumber;
  }

}
