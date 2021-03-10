import java.util.ArrayList;

class Player {
  private int eggs;
  private ArrayList<Egg> basket;

  //Creation of Default Constructor 
  Player() {
    eggs = 0;
    basket = new ArrayList<Egg>();
  }
  
  //Method to keep track of eggs found
  public void foundEgg(Egg foundAnEgg) {
    eggs++;
    basket.add(foundAnEgg);
  }

  //prints out each found egg with its color and contents (called in Print egg from Egg Class)
  public void printBasket() {
    for(int num = 0; num<basket.size(); num++) {
      basket.get(num).printEgg();
    }
  }

  //Accessor for Number of eggs
  public int getNumberOfEggs() {
    return eggs;
  }

  //Accessor for Basket
  public ArrayList<Egg> getBasket() {
    return basket;
  }
}