//Exercise2.java

import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

public class Exercise2{
   public static void main(final String args[]) {
       int i=0, over=0, under=0;
       float height[] = new float[10];
       float heightSingular=0;
       String heightAsString;

    for (i=0;i<10;i++)
        {
        heightAsString = JOptionPane.showInputDialog(null,"Please enter the height of person " + (i+1));

        heightSingular = Float.parseFloat(heightAsString);

        if(heightSingular>1.8)
            {
            over++;
            }
        else
        
        if(heightSingular<1.6)
            {
            under++;
            }
        else

        heightSingular += height[i];
        }

        JOptionPane.showMessageDialog(null,"The total number of people over 1.8m is " + over +
        "\nThe total number of people under 1.6m is " + under);
    }
}