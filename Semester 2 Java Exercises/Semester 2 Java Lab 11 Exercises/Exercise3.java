//Exercise3.java

import javax.swing.JOptionPane;

public class Exercise3{
    public static void main(String args[])
    {
        int marks[] = new int [10];
        int total=0, i, highest=0, lowest=100;
        String text, markAsString;
        double average;

        for (i = 0; i < marks.length; i++)
        {
            markAsString = JOptionPane.showInputDialog("Enter mark for student " + (i+1));
            marks[i] = Integer.parseInt(markAsString);
            total += marks[i];

            if(marks[i]>highest)
                {
                highest = marks[i];
                }
            else  
            
            if(marks[i]<lowest)
                {
                lowest = marks[i];
                }
        }

        average = (double)total/marks.length;

        JOptionPane.showMessageDialog(null,"The average mark is: " + String.format("%.2f",
        average),"Average Mark",JOptionPane.INFORMATION_MESSAGE);

        text = "List of marks above the average is :\n\n";
        for (i = 0; i < marks.length; i++)
                if (marks[i] > average)
                text += marks[i] + " ";

        JOptionPane.showMessageDialog(null,text,"Marks Above Average",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"The highest mark entered is " + highest +
        "\nThe lowest mark entered is " + lowest);
    }
}