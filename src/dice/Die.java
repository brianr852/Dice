/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

import java.util.Random;

/**
 *
 * @author brian
 */
public class Die {
    private int numberOfSides;
    private int face;
       // This constant holds the default value of number of sides
    public static final int DEFAULT_NUMBER_OF_SIDES = 6;
    
    /**
     * The default constructor creates the die object with the DEFAULT_NUMBER_OF_SIDES 
     * and performs the initial roll of the die
     *
     */
    public Die()
    {
           // This is a default constructor (does not take any parameter). 
           // Sets the numberOfSides to the default value.
           // The value of the face field is generated and set
           // by the roll method
        setNumberOfSides(DEFAULT_NUMBER_OF_SIDES);
        roll();
    }
    /**
     * The secondary constructor creates the die object and performs the initial
     * roll of the die
     *
     * @param numberOfSides the number of sides for this die
     */
    public Die(int numberOfSides)
    {
           // This is a secondary constructor (takes a parameter). 
           // Notice that the constructor has a parameter for
           // the number of sides that is passed by the client. Since the input must
           // be validated constructor calls the mutator method setNumberOfSides to set the value
           // of the numberOfSides field. The value of the face field is generated and set
           // by the roll method
        setNumberOfSides(numberOfSides);
        roll();
    }

    /**
     * Mutator method
     * Validates that the initialNumberOfSides is either:
     * four, six, eight, ten, twelve, or twenty numberOfSides.
     * If not sets numberOfSides to the default value
     *
     * @param initialNumberOfSides
     */
    public void setNumberOfSides(int initialNumberOfSides)
    {
           // This is a mutator method for the numberOfSides field.
           // It validates the input first. If the input is valid
           // uses it to set the value of numberOfSides field. If the input
           // is invalid sets the numberOfSides field to DEFAULT_NUMBER_OF_SIDES
        switch (initialNumberOfSides)
        {
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 20:
                numberOfSides = initialNumberOfSides;
                break;
            default:
                numberOfSides = DEFAULT_NUMBER_OF_SIDES;
                break;
        }
    }

    /**
     * Accessor method
     *
     * @return the current value of numberOfSides
     */
    public int getNumberOfSides()
    {
        return numberOfSides;
    }

    /**
     * Mutator method
     * Generates randomly the face of the roll of the die
     */
    public void roll()
    {
           // This is a mutator method for the face field. First it creates a Random object
           // which is referenced by the rand variable. It uses the rand object to get
           // a random number that is in the appropriate range for this particular die.
           // For example, if the field numberOfSides is set to 6, field face will be set to an integer
           // in the range of 1 through 6
        Random rand = new Random();
        face = rand.nextInt(numberOfSides) + 1;
    }

    /**
     * Accessor method
     *
     * @return the current face of the roll of the die
     */
    public int getFace()
    {
        return face;
    }
    
}
