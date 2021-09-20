package StenSaxPåse;
import java.util.Scanner;
/**
 * A class representing Computer
 * For example:
 * <pre>
 *    Computer objComputer = new Computer();
 * </pre>
 * @author  Srikanth
 * @version 1.0, 15/09/2021
 */
public class Computer {
    private static int computerChoice;
    /**
     * Constructor for initiating the class
     * @param
     * @return
     */
    public Computer()
    {
    }
    /**
     * Method for asking ComputerChoice
     * @param
     * @return
     */
    public void askComputerChoice() {

        computerChoice = (int)(Math.random()*3) + 1;

        System.out.println("Computer Input:" + computerChoice);
    }
    /**
     * Method for requesting ComputerChoiceValid
     * @param
     * @return boolean
     */
    public boolean isComputerChoiceValid() {
        boolean isChoiceValid = false;
        if((computerChoice >= 1) && (computerChoice <= 3)) {
            isChoiceValid = true;
        }  else {
            System.out.println("Your move isn't valid! Please select only options \"1\" / \"2\" / \"3\"");
        }
        return isChoiceValid;
    }
    /**
     * Method for requesting ComputerChoice
     * @param
     * @return ComputerChoice
     */
    public static int getComputerChoice()
    {
        return computerChoice;
    }
}
