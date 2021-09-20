package StenSaxPåse;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 * A class representing RunGame
 * For example:
 * <pre>
 *    Rungame objRunGame = new RunGame();
 * </pre>
 * @author  Srikanth
 * @version 1.0, 15/09/2021
 */
public class RunGame {
    private static Menu menu;
    private static Player player;
    private static Computer computer;
    private static MatchLogic matchLogic;

/**
 * Main method for initiating the game
 * This method won't return any value
 * @param  args used for specifying command line args
 */


public static void main(String[] args) {
        player = new Player();
        computer = new Computer();
        menu = new Menu();
        matchLogic = new MatchLogic();

        // Print Welcome text.
        System.out.println("Welcome to STEN, SAX, PÅSE!");

        //Use a while(true) loop and only break the loop if the user wants to quit
        while(true) {
            menu.printMainMenu();
            //Read Player's menu choice.
            player.askPlayerChoice();
            if (player.isPlayerChoiceValid()) {
                if (player.getPlayerChoice() == 3) {
                    //user wants to quit the game
                    break;
                } else if (player.getPlayerChoice() == 2) {
                    //Print History.
                    player.printMatchHistory();
                } else {
                    while(true) {
                        menu.printPlayerChoiceMenu();
                        player.askPlayerChoice();
                        if (player.isPlayerChoiceValid()) {
                            computer.askComputerChoice();
                            if (computer.isComputerChoiceValid()) {
                                matchLogic.decidePlayerMatchResult(player, computer);
                                menu.printAfterMatchMenu();
                                player.askPlayerChoice();
                                if (player.isPlayerChoiceValid()) {
                                    if (player.getPlayerChoice() == 3) {
                                        //user wants to quit the game
                                        System.out.println("We are sorry to see you go and hope you come back again!\n");
                                        return;
                                    } else if (player.getPlayerChoice() == 2) {
                                        //Print History.
                                       continue;
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
