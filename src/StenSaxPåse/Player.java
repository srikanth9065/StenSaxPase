package StenSaxPåse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * A class representing Player
 * For example:
 * <pre>
 *    Player objPlayer = new Player();
 * </pre>
 * @author  Srikanth
 * @version 1.0, 15/09/2021
 */
public class Player {

    private static ArrayList<String> matchHistory;
    private static int playerChoice;

    /**
     * Constructor for initiating the class
     * @param
     * @return
     */

    public Player() {
        matchHistory = new ArrayList<String>();
        playerChoice = 0;
    }
    /**
     * Method for printing match history
     * @param
     * @return
     */
    public void printMatchHistory()
    {

        if(matchHistory.size() > 0)
        {
            System.out.println("Printing history...");
            matchHistory.forEach(System.out::println);
        } else
        {
            System.out.println("No history available...");
        }
    }
    /**
     * Method for adding match history
     * @param matchResult This is a string to represent the match result
     * @return
     */
    public void addMatchToHistory(String matchResult) {
        if(matchResult != null) {
            matchHistory.add(matchResult);
        }
    }
    /**
     * Method for requesting player choice
     * @param
     * @return
     */
    public void askPlayerChoice() {
        System.out.println("User Input: ");

        Scanner in = new Scanner(System.in);
        String myChoice = in.nextLine();
        playerChoice =Integer.parseInt(myChoice);
    }
    /**
     * Method for requesting PlayerChoiceValid
     * @param
     * @return boolean
     */

    public boolean isPlayerChoiceValid() {
        boolean isChoiceValid = false;
        if((playerChoice >= 1) && (playerChoice <= 3)) {
            isChoiceValid = true;
        }  else {
            System.out.println("Your move isn't valid! Please select only options \"1\" / \"2\" / \"3\"");
        }
        return isChoiceValid;
    }
    /**
     * Method for requesting PlayerChoice
     * @param
     * @return playerChoice an integer value to represent the player value
     */
    public static int getPlayerChoice()
    {
        return playerChoice;
    }
}
