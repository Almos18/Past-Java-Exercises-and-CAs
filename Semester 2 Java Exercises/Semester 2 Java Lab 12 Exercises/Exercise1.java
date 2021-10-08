//Exercise1.java

import javax.swing.JOptionPane;

public class Exercise1 {
    public static void main(String args[])
    {
     String height[] = new String[10];
     
     readArray(height);

     averageHeight(height);

     smallestHeight(height);

     tallestHeight(height);

     overACertainVariable(height);

     JOptionPane.showMessageDialog(null,"Average Height " + (averageHeight(height)/10) + "\nSmallest Height " + smallestHeight(height) + "\nTallest Height " + tallestHeight(height));

     JOptionPane.showMessageDialog(null,"The list of heights entered over 1.7m are " + overACertainVariable(height));

    }

    public static void readArray(String h[])
    {
        for (int i=0;i<10;i++)   
        h[i] = JOptionPane.showInputDialog(null,"Enter height for student " + (i+1));       
    }

    public static float averageHeight(String h[])
    {
        float average[] = new float[10];
        float averageNormal=0;

        for(int i=0;i<10;i++)
        {
            average[i] = Float.parseFloat(h[i]);

            averageNormal += average[i];
        }
        return averageNormal;
    }

    public static float smallestHeight(String h[])
    {
        float smallest=999999999;
        float smallestAsArray[] = new float[10]; 

        for (int i=0;i<10;i++)
        {
            smallestAsArray[i] = Float.parseFloat(h[i]);

            if(smallestAsArray[i] < smallest)
            {
                smallest = smallestAsArray[i];
            }
        }
        return smallest;
    }

    public static float tallestHeight(String h[])
    {
        float tallest=0;
        float tallestAsArray[] = new float[10];

        for(int i=0;i<10;i++)
        {
            tallestAsArray[i] = Float.parseFloat(h[i]);

            if(tallestAsArray[i] > tallest)
            {
                tallest = tallestAsArray[i];
            }
        }
        return tallest;
    }

    public static String overACertainVariable(String h[])
    {
        float overAsArray[] = new float[10];
        String over="";

        for(int i=0;i<10;i++)
        {
            overAsArray[i] = Float.parseFloat(h[i]);

            if(overAsArray[i]>1.7)
            {
                over += overAsArray[i] + "\n";
            }
        }
        return over;

    }

}