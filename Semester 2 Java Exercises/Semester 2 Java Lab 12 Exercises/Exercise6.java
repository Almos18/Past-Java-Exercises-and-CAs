//Exercise6.java

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercise6{
    public static void main(String args[])
    {
        int lottoNumbers[] = new int[7];
        boolean alreadyPicked[] = new boolean[43];
        int numbers;

        for(int i=0;i<lottoNumbers.length;i++)
        {
            numbers = (int)(Math.random()*43)+1;

            while(alreadyPicked[numbers])
                numbers = (int)(Math.random()*43)+1;
     
            alreadyPicked[numbers] = true;
            lottoNumbers[i] = numbers;
        }

        Arrays.sort(lottoNumbers);

        JOptionPane.showMessageDialog(null,"The Numbers Are:\n\n " + Arrays.toString(lottoNumbers));

        System.exit(0);
    }
}