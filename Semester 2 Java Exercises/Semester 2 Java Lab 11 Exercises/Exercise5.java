//Exercise5.java

import javax.swing.JOptionPane;

public class Exercise5{
    public static void main(String args[])
    {
    int integers[] = new int[10];
    int highest=0, lowest=2147483647;
    String integerAsString="";

    for(int i=0;i<10;i++)
    {
    integerAsString = JOptionPane.showInputDialog(null,"Please enter an integer");
    integers[i] = Integer.parseInt(integerAsString);
    
    if(integers[i]>highest)
        {
            highest = integers[i];    
        }
    if(integers[i]<lowest)
        {
            lowest = integers[i];    
        }
    }

    JOptionPane.showMessageDialog(null,"The first number of the array is " + integers[0]);

    JOptionPane.showMessageDialog(null,"The fifth number of the array is " + integers[4]);

    JOptionPane.showMessageDialog(null,"The largest number is " + highest);

    JOptionPane.showMessageDialog(null,"The smallest number is " + lowest);
    }
}