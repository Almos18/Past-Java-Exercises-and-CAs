package labsheet2;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class NamesArray {

    public static void main(String args[])
    {
        String arrayString[] = populateArray();
        String longestName="";
        int averageNames=0;

        for(int i=0;i<5;i++)
        {
            if(arrayString[i].length()>longestName.length())
            {
                longestName = arrayString[i];
            }

            averageNames += arrayString[i].length();
        }

        Arrays.sort(arrayString);

        JOptionPane.showMessageDialog(null,"The longest name is " + longestName +
                "\n\nThe average character per name is " + (averageNames/5) +
                "\n\nThe array in ascending order is:\n\n" + Arrays.toString(arrayString),"Results",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static String[] populateArray()
    {
        String namesArray[] = new String[5];
        String names;

        for(int i=0;i<5;i++)
        {
            names = JOptionPane.showInputDialog(null, "Please enter the name of person " +
                    (i + 1), "Input",JOptionPane.QUESTION_MESSAGE);
            namesArray[i] = names;
        }
        return namesArray;
    }
}
