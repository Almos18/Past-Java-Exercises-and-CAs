package labsheet1;

import javax.swing.JOptionPane;

public class CyclistSponsor {

    public static void main(String args[])
    {
        String name, kmCycledAsString;
        float kmCycled;

        name = JOptionPane.showInputDialog(null,"Please enter your name",
                "Input",JOptionPane.QUESTION_MESSAGE);

        kmCycledAsString = JOptionPane.showInputDialog(null,"Please enter the number of km cycled",
                "Input",JOptionPane.QUESTION_MESSAGE);
        kmCycled = Float.parseFloat(kmCycledAsString);

        if(kmCycled<=10)
        {
            JOptionPane.showMessageDialog(null, "Name: " + name +
                    "\nDistance Cycled: " + kmCycled + "km" + "\nSponsorship Amount Due: €" + kmCycled*1.75,"Receipt",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Name: " + name +
                    "\nDistance Cycled: " + kmCycled + "km" + "\nSponsorship Amount Due: €" + (((kmCycled - 10) * 2.5) + 17.5), "Receipt", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}