//Exercise4.java

import javax.swing.JOptionPane;

public class Exercise4{
    public static void main(String args[])
    {
        int marks[] = new int [10];
        int total=0, i, highest=0, lowest=100;
        String text, markAsString;
        String names[] = new String[10];
        double average;

        for (i = 0; i < marks.length; i++)
        {
            markAsString = JOptionPane.showInputDialog("Enter mark for student " + (i+1));
            marks[i] = Integer.parseInt(markAsString);
            total += marks[i];

            names[i] = JOptionPane.showInputDialog("Enter student " + (i+1) + "'s name");

            if(marks[i]>highest)
                {
                highest = marks[i];
                }
            else  
            
            if(marks[i]<lowest)
                {
                lowest = marks[i];
                }
            else   
                highest = highest;              
        }

        average = (double)total/marks.length;

        JOptionPane.showMessageDialog(null,"The average mark is: " + String.format("%.2f",
        average),"Average Mark",JOptionPane.INFORMATION_MESSAGE);

        text = "List of names above the average is :\n\n";
        for (i = 0; i < marks.length; i++)
                if (marks[i] > average)
                text += names[i] + " ";

        JOptionPane.showMessageDialog(null,text,"Marks Above Average",
        JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"The highest mark entered is " + highest +
        "\nThe lowest mark entered is " + lowest);
    }
}