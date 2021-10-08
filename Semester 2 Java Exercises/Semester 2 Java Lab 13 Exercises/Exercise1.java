//Exercise1.java

import javax.swing.JOptionPane;
import java.util.Arrays;


public class Exercise1{
    public static void main(String args[])
    {
        String names[] = {"James Maye", "Joe Bloggs", "Jane Doe", "Teresa Coughlan", "Sam Stewart"};
        String temp2;
        double largestNames=0, temp; 
        int sub;
        double GPA[] = {3.56 , 2.47 , 3.12 , 2.55 , 2.78};

        for(int i=0;i<GPA.length-1;i++)
        {
            largestNames = GPA[i];
            sub=i;

            for(int j=i+1;j<GPA.length;j++)
            {
                if(GPA[j]>largestNames)
                {
                    largestNames=GPA[j];
                    sub=j;
                }
            }
            temp = GPA[i];
            GPA[i] = GPA[sub];
            GPA[sub] = temp;
            temp2 = names[i];
            names[i] = names[sub];
            names[sub] = temp2;
        }

        JOptionPane.showMessageDialog(null, "Name                                   GPA\n--------                                   --------\n\n" +
        "\n" + names[0] + "                      " + GPA[0] +
        "\n" + names[1] + "                      " + GPA[1] +
        "\n" + names[2] + "                      " + GPA[2] +
        "\n" + names[3] + "                      " + GPA[3] +
        "\n" + names[4] + "                      " + GPA[4]);


        JOptionPane.showMessageDialog(null,"The average GPA is " + averageGPA(GPA));    
        
        JOptionPane.showMessageDialog(null, + standardDeviationGPA(GPA));

        System.exit(0);
    }

    public static double averageGPA(double GPA[])
    {
        double average=0;

        for(int i=0;i<GPA.length;i++)
        {
            average += GPA[i];
        }
        average = average/5;

        return average;
    }

    public static double standardDeviationGPA(double G[])
    {
        double standardDeviation=5;

        for(int i=0;i<4;i++)
        {
        standardDeviation += (Math.sqrt( (0.2) * ((G[i] - 2.5)) ));
        }

        return standardDeviation;

    }
}