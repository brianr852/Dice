/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author brian
 */
public class Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // These statements declare two constants: 
    // DIE2_SIDES is the number of sides for the second die (12),
    final int DIE2_SIDES = 12;
    // MAX_ROLLS is the number of times to roll the dice (10).
    final int MAX_ROLLS = 10;
    
    // These statements create two instances of the Die class. Notice
    // that DIE1_SIDES, which is 6, and DIE2_SIDES, which is 12, are passed
    // to the constructor. As a result, die1 will reference a Die object with
    // six sides, and die2 will reference a Die object with twelve sides
    Die die1 = new Die();
    Die die2 = new Die(DIE2_SIDES);
    
    System.out.println("This program simulates the rolling of a "
                         + Die.DEFAULT_NUMBER_OF_SIDES + " sided die and a "
                         + DIE2_SIDES + " sided die.");   
    
    // This statement displays the initial faces of both Die objects.
    // Recall that the Die class constructor performs the initial roll
    // of the die.
    int die1Face = die1.getFace();
    int die2Face = die2.getFace();
    System.out.println("Initial faces of the dice are:");
    System.out.println("\tFor " + die1.getNumberOfSides() + " sided die is " + die1Face 
                         + ", and for " + die2.getNumberOfSides() + " sided die is " + die2Face);
     
    int target = die1Face + die2Face;
    // This for loop iterates MAX_ROLLS times. Each time the loop iterates
    // new faces are generated for both dice.
    System.out.println("\nRolling the dice " + MAX_ROLLS + " times, the target sum is: " + target);
    int count = 0;
    int sum;
    for (int i = 0; i < MAX_ROLLS; i++)
    {
      // This statement calls die1 object's roll method to get new face
      die1.roll();
      // This statement calls die2 object's roll method to get new face
      die2.roll();
      // This statement displays the current faces of both Die objects
      die1Face = die1.getFace();
      die2Face = die2.getFace();
      sum = die1Face + die2Face;
      System.out.println("\tRolled " + die1Face + " and " + die2Face + "; sum is " + sum);
      if (sum == target)
      {
        count++;
      }
    }
    System.out.println("\nIn " + MAX_ROLLS + " tries, sum of " + target + " was rolled " + count + " times.");

    }
    
}
