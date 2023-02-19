/* It is the simple number guessing game. The player has 5 tries to guess the number. 
  --> The player's guess is obtained using a dialog box.

  --> If the guess is correct, the player wins and the game ends. 
  --> If the player has used up all 5 tries, the game ends and the player loses.
 */
import javax.swing.JOptionPane;

public class NumberGuessing {
  public static void main(String[] args) {

    //For randomly generate the number
    int target = (int) (Math.random() * 100) + 1; 
    int tries = 0;

    while (tries < 5) {
      tries++;
      String input = JOptionPane.showInputDialog("Enter your guessing number (" + tries + "/5):");

      int number = Integer.parseInt(input); //Number is a guessing number
      
      if (number == target) {
        JOptionPane.showMessageDialog(null, "Congratulations! You guessed it in " + tries + " tries.");
        return;
      } else if (number > target) {
        JOptionPane.showMessageDialog(null, "Too high! Try again.");
      } else {
        JOptionPane.showMessageDialog(null, "Too low! Try again.");
      }
    }
    JOptionPane.showMessageDialog(null, "Sorry, you couldn't guess the number. The number was " + target + ".");
  }
}

