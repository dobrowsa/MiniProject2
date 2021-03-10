/* Programmers: Sam Dobrowolski, Joey Desantis, Christoper Sonnhalter
Date: 3/9/2021 Version 1*/

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number:");
      int number = s.nextInt();
      // Logic to only accept positive whole numbers and throw an error if the number is negative
      while (number < 0) {
        System.out.println("Sorry, we cannot accept a negative number for the amount of players. Please enter a positive number.");
        System.out.println("Please enter a positive whole number: ");
        number = s.nextInt();
      }

      //Forming of Array of any number of players inputted by user
      ArrayList<Player> players = new ArrayList<Player>();

      for(int num = 0; num<number; num++) {
        players.add(new Player());
      }

      System.out.println("We have added " + number + " players to this hunt. Let's find some eggs!");

      // Call of Hunt Method
      hunt(players);

      //Call of Recap Method
      recap(players);
      
      // Call of Stats Method
      stats(players);

  }

  //Creation of Hunt Method where the Easter Egg Hunt actually takes place
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

  //Creatoin of Recap Method where you can see each individual players basket and the colors and contents of the eggs they found
  public static void recap(ArrayList<Player> allPlayers) {
    for (int num = 0; num<allPlayers.size();num++) {
      System.out.println();
      System.out.println("Player " + num + " found " + allPlayers.get(num).getNumberOfEggs() + " eggs");
      allPlayers.get(num).printBasket();
    }
  }

  //Creation of Stats Method where the stats of player with most eggs found, total eggs found by color and total eggs found by content
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
  

  // Logic to count the number of colors of eggs found.
  int[] colors = new int[4];
    for(int num = 0; num < allPlayers.size(); num++) {
      for(int number = 0; number < allPlayers.get(num).getNumberOfEggs(); number++) {
        if(allPlayers.get(num).getBasket().get(number).getColors().equals("pink"))
          colors[0]++;
        if(allPlayers.get(num).getBasket().get(number).getColors().equals("blue"))
          colors[1]++;
        if(allPlayers.get(num).getBasket().get(number).getColors().equals("yellow"))
          colors[2]++;
        if(allPlayers.get(num).getBasket().get(number).getColors().equals("green"))
          colors[3]++;
      }
    }

    //Additional functionality in finding the sum of all eggs found
    int sum = 0;
    for(int num : colors)
    sum += num;
    
    System.out.println();
    System.out.println("Total Eggs Found by Color");
    System.out.println("Pink Eggs: " + colors[0]);
    System.out.println("Blue Eggs: " + colors[1]);
    System.out.println("Yellow Eggs: " + colors[2]);
    System.out.println("Green Eggs: " + colors[3]);
    //Print Statement for Total Sum of Eggs found
    System.out.println("There were a total of " + sum + " eggs found!");
  
// Extra Credit for Breaking Down the Stats for the Content of the Eggs
  int[] contents = new int[7];
    for(int num = 0; num < allPlayers.size(); num++) {
      for(int number = 0; number < allPlayers.get(num).getNumberOfEggs(); number++) {
        if(allPlayers.get(num).getBasket().get(number).getContents().equals("one dollar"))
          contents[0]++;
        if(allPlayers.get(num).getBasket().get(number).getContents().equals("50 cents"))
          contents[1]++;
        if(allPlayers.get(num).getBasket().get(number).getContents().equals("pink Starburst"))
          contents[2]++;
        if(allPlayers.get(num).getBasket().get(number).getContents().equals("yellow Peep"))
          contents[3]++;
        if(allPlayers.get(num).getBasket().get(number).getContents().equals("25 cents"))
          contents[4]++;
        if(allPlayers.get(num).getBasket().get(number).getContents().equals("Reese's Egg"))
          contents[5]++;
        if(allPlayers.get(num).getBasket().get(number).getContents().equals("Cadbury Egg"))
          contents[6]++;
      }
    }

    System.out.println();
    System.out.println("Total Eggs Found by Content");
    System.out.println("One Dollar: " + contents[0]);
    System.out.println("50 Cents: " + contents[1]);
    System.out.println("Pink Starburst: " + contents[2]);
    System.out.println("Yellow Peep: " + contents[3]);
    System.out.println("25 Cents: " + contents[4]);
    System.out.println("Reese's Egg: " + contents[5]);
    System.out.println("Cadbury Egg: " + contents[6]);
  }
} 

