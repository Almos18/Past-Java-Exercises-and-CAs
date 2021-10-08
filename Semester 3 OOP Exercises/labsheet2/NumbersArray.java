package labsheet2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class NumbersArray {

    public static void main(String args[])
    {
        double numbersArray[] = {22.3,45.6,27.4,56.6,73.2,11.5,87.4,23.8};

        JOptionPane.showMessageDialog(null,"The largest value in the array is " + largest(numbersArray) +
                "\nThe average value in the array is " + average(numbersArray) + "\nThe list of values above the average is " +
                aboveAverage(numbersArray),"Array Stats",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static double largest(double numbersArray[])
    {
        double largest=0;

        for(int i=0;i<8;i++)
        {
            if(numbersArray[i]>largest)
            {
                largest=numbersArray[i];
            }
        }
        return largest;
    }

    public static double average(double numbersArray[])
    {
        double average=0;

        for(int i = 0; i<8;i++)
        {
            average += numbersArray[i];
        }
        average = (average/8);

        return average;
    }

    public static String aboveAverage(double numbersArray[])
    {
        double aboveAverage[] = new double[8];
        String aboveAverageAsString = "";

        for(int i=0;i<8;i++)
        {
            if(numbersArray[i]>average(numbersArray))
            {
                aboveAverage[i] = numbersArray[i];
            }
            if(aboveAverage[i]!=(double)0)
            {
                aboveAverageAsString += (aboveAverage[i]+(" "));
            }
        }
        return aboveAverageAsString;
    }
}
