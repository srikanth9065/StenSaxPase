package StenSaxPåse;
/**
 * A class representing Match Logic
 * For example:
 * <pre>
 *    MatchLogic objMatchLogic = new MatchLogic();
 * </pre>
 * @author  Srikanth
 * @version 1.0, 15/09/2021
 */
public class MatchLogic {
    /**
     * Constructor for initiating the class
     * @param
     * @return
     */
    public MatchLogic() {

    }
    /**
     * Method for deciding PlayerMatchResult
     * @param
     * @return
     */
    public void decidePlayerMatchResult(Player player, Computer computer) {
        String strUserChoice = getStringFromChoice(Player.getPlayerChoice());
        String strComputerChoice = getStringFromChoice(Computer.getComputerChoice());
        if(strUserChoice.equals(strComputerChoice)) {
            System.out.println("Result: It's a draw!");
            player.addMatchToHistory("Draw");
        } else if((strUserChoice.equals("PÅSE") && strComputerChoice.equals("STEN")) || (strUserChoice.equals("SAX") && strComputerChoice.equals("PÅSE")) || (strUserChoice.equals("STEN") && strComputerChoice.equals("SAX"))) {
            System.out.println("Result: You won! Good work!\n");
            player.addMatchToHistory("Won");
        } else {
            System.out.println("Result: You have lost!");
            player.addMatchToHistory("Lost");
        }
    }
    /**
     * Method for converting choice to String
     * @param choice Integer value represents user Choice
     * @return strChoice String representing Sten,Sax or Påse
     */
    private String getStringFromChoice(int choice) {
        String strChoice;
        if(choice == 1) {
            strChoice = "STEN";
        } else if(choice == 2) {
            strChoice = "SAX";
        } else if (choice == 3) {
            strChoice = "PÅSE";
        } else {
            strChoice = "Invalid Option";
        }
        return strChoice;
    }
}
