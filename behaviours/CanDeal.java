package behaviours;
import java.util.*;

public interface CanDeal {

  void dealCard(DealtToAble player);
  void dealStartHand(int number);
  ArrayList<DealtToAble> getPlayers();

}