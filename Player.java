import java.util.ArrayList;

class Player {
  private int eggs;
  private ArrayList<Egg> basket;

  Player() {
    eggs = 0;
    basket = new ArrayList<Egg>();
  }
  
  public void foundEgg(Egg foundAnEgg) {
    eggs++;
    basket.add(foundAnEgg);
  }

  public void printBasket() {
    for(int num = 0; num<basket.size(); num++) {
      basket.get(num).printEgg();
    }
  }

  public int getNumberOfEggs() {
    return eggs;
  }

  public ArrayList<Egg> getBasket() {
    return basket;
  }
}