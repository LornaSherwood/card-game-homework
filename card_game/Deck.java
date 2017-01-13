package card_game;
import behaviours.*;
import java.util.*;


public class Deck {
  String name;
  int totalNumber;
  ArrayList<Populatable> pack; // array of populatable cards called pack

  public Deck(String name, int totalNumber) {
    this.name = name;
    this.totalNumber = totalNumber;
    this.pack = new ArrayList<Populatable>();
  }

  public String getName(){
    return this.name;
  }

  public int getTotalNumber(){
    return this.totalNumber;
  }

  public int packCount(){
    return pack.size();
  }

  public void getCard(Populatable card){
    pack.add(card);
  }

  public Populatable showCard(int index){
    return pack.get(index);
  }

  

}
