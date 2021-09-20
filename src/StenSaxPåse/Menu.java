package StenSaxPåse;

import java.util.Scanner;
/**
 * A class representing Menu
 * For example:
 * <pre>
 *    Menu objMenu = new Menu();
 * </pre>
 *
 * @author  Srikanth
 * @version 1.0, 15/09/2021
 */
public class Menu {
    /**
     * Constructor for initiating the class
     * @param
     * @return
     */
    public Menu() {
    }
    /**
     * Method for printing MainMenu
     * @param
     * @return
     */
    public void printMainMenu()
    {
        //Get the user's move through user input.
        System.out.println("1. New Match 2. History 3. End the Game");
    }
    /**
     * Method for printing PlayerChoiceMenu
     * @param
     * @return
     */
    public void printPlayerChoiceMenu()
    {
        System.out.println("What do you choose?");
        System.out.println("1. STEN 2. SAX 3. PÅSE");
    }
    /**
     * Method for printing AfterMatchMenu
     * @param
     * @return
     */
    public void printAfterMatchMenu()
    {
        System.out.println("1. Menu 2. Run Again 3. End the Game");
    }
}
