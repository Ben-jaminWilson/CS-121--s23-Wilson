package activity4;

import javax.swing.JOptionPane;

public class act4{
    public static void main(String[] args) {

        String food = JOptionPane.showInputDialog("Enter either chicken, beef, salad or candy");
        switch (food) {
            case "chicken":
                JOptionPane.showMessageDialog(null, "Protein:high Tastiness:medium Health: medium");
                break;

            case "beef":
                JOptionPane.showMessageDialog(null, "Protein:high Tastiness:high Health: low");
                break;
            case "salad":
                JOptionPane.showMessageDialog(null, "Protein:low Tastiness:low Health: very high");
                break;
            case "candy":
                JOptionPane.showMessageDialog(null, "protein:low Tastiness:very high Health: very low");
                break;

            default:
                JOptionPane.showMessageDialog(null, "please write responses correctly, and in lowercase");
        }
    }
}