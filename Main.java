import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number:");
      int number = s.nextInt();

      ArrayList<Player> players = new ArrayList<Player>();

      for(int num = 0; num<number; num++) {
        players.add(new Player());
      }

      System.out.println("We have added " + number + " players to this hunt. Let's find some eggs!");

      hunt(players);

      recap(players);
      
      stats(players);

  }

  public static void hunt(ArrayList<Player> allPlayers) {
    Random r = new Random();
    int numberOfEggsFound;

    for(int num = 0; num<allPlayers.size(); num++) {
      numberOfEggsFound = r.nextInt(11);
      for(int number = 0; number<numberOfEggsFound; number++) {
        allPlayers.get(num).foundEgg(new Egg());
      }
    }
  }

  public static void recap(ArrayList<Player> allPlayers) {
    for (int num = 0; num<allPlayers.size();num++) {
      System.out.println();
      System.out.println("Player " + num + " found " + allPlayers.get(num).getNumberOfEggs() + " eggs");
      allPlayers.get(num).printBasket();
    }
  }

  public static void stats(ArrayList<Player> allPlayers) {
    int playerWithMostEggsFound = 0;
    int playerTotalNumOfEggsFound = 0;

    for(int num = 0; num <allPlayers.size(); num++) {
      if(allPlayers.get(num).getNumberOfEggs() > playerTotalNumOfEggsFound) {
        playerTotalNumOfEggsFound = allPlayers.get(num).getNumberOfEggs();
        playerWithMostEggsFound = num;
      }
    }
    System.out.println();
    System.out.println("Player " + playerWithMostEggsFound + " found the most eggs, with " + playerTotalNumOfEggsFound + " eggs!");
  }
}