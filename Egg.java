import java.util.Random;

class Egg {
  private String color;
  private String contents;

  Egg() {
    color = randomColor();
    contents = randomContents();
  }

  // Method for creating random Color Generation (using an array)
  public String randomColor() {
    Random r = new Random();
    String[] colors = {"blue", "pink", "yellow", "green"};
    //0-3 indices related to colors in above array
    int color = r.nextInt(4);
      // returns the color from array that is associated to the random Number Generated
      return colors[color];
  }

  // Method for creating random Content Generation (using an array)
  public String randomContents() {
    Random r = new Random();
    String[] content = {"Cadbury Egg","Reese's Egg","pink Starburst","yellow Peep", "25 cents", "50 cents", "one dollar"};
    //0-6 indices related to contents in above array
    int contents = r.nextInt(7);
      // returns the contents from array that is associated to the random Number Generated
      return content[contents];
  }

  // Prints out contents and color of eggs
  public void printEgg() {
    System.out.println(color + " egg contains " + contents);
  }

  //Accessor for Egg color
  public String getColors() {
    return color;
  }

  //Accessor for Egg contents
  public String getContents() {
    return contents;
  }
}