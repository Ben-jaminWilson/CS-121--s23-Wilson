{
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class activity5 {
    public static void main[string[] args]

    {
        List<string> yesList = new ArrayList<>();
        yesList.add("yes");
        yesList.add("Y");
        yesList.add("Yes");
        yesList.add("y");

        String veganInput = JOptionPane.ShowInputDialog("Vegan? Y/N");
        String glutenInput = JOptionPane.ShowInputDialog("Glutin allergy? Y/N");
        String vegetarianInput = JOptionPane.ShowInputDialog("vegetarian? Y/N");

        boolean veganInput.contain(yesList);
        boolean glutenInput.contain(yesList);
        boolean vegetarianInput.contain(yesList);
        if (!veganInput && !glutenInput && !vegetarianInput) ;{
            JOptionPane.showMessageDialog(null, "Joe's Gourmet Burgers");}
        if (!veganInput) ;{
            JOptionPane.showMessageDialog(null, "Main Street Pizza Co. ");}
        if (!veganInput && !glutenInput) ;{
            JOpptionPane.showMessageDialog(null, "Mama's Fine Italian");}

        JOptionPane.showMessageDialog(null, "The Chef's Kitchen")
        JOptionPane.showMessageDialog(null, "Corner Cafe");


    }    if veganInput(yes);


    }
}
