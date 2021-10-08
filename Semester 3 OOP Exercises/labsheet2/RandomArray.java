package labsheet2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class RandomArray {

    public static void main(String args[])
    {
        int randomArrayNumbersAgain[] = new int[10];
        int randomArrayNumbersOrganised[] = new int[10];
        int largerThan100=0;


        randomArrayNumbersAgain = populateArray();
        randomArrayNumbersOrganised = Arrays.copyOf(randomArrayNumbersAgain,randomArrayNumbersAgain.length);

        for(int i=0;i<10;i++) {
            if(randomArrayNumbersAgain[i] > 100)
            {
                largerThan100++;
            }
        }

        int sub;
        int temp;

        for(int i=0;i<randomArrayNumbersOrganised.length-1;i++)
        {
            int larger = randomArrayNumbersOrganised[i];
            sub = i;

            for(int j = (i+1);j<randomArrayNumbersOrganised.length;j++)
                if(randomArrayNumbersOrganised[j]>larger)
            {
                larger = randomArrayNumbersOrganised[j];
                sub = j;
            }

            temp = randomArrayNumbersOrganised[i];
            randomArrayNumbersOrganised[i] = randomArrayNumbersOrganised[sub];
            randomArrayNumbersOrganised[sub] = temp;
        }

        JOptionPane.showMessageDialog(null,"The initial contents of the array are " +
                Arrays.toString(randomArrayNumbersAgain) + "\nThe percentage of values that exceed 100 is " +
                largerThan100 + "0% \nThe contents of the array after sorting is: " + Arrays.toString(randomArrayNumbersOrganised),
                "Array Stats",JOptionPane.INFORMATION_MESSAGE);
    }

    private static int[] populateArray()
    {
        int randomArrayNumbers[] = new int[10];

        for(int i = 0; i<10;i++) {
            randomArrayNumbers[i] = (int) ((Math.random() * 1000) - 1);
        }
        return randomArrayNumbers;
    }
}
