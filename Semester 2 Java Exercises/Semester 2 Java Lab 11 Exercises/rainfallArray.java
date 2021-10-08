//rainfallArray.java

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class rainfallArray{
    public static void main(final String args[]){
        final int rainfall[] = {7, 12, 10, 4, 5, 3, 1, 4, 3, 7, 8, 10};
        int month, i, janToJuneRainfall=0, winterRainfall, springRainfall;
        String text = "", monthAsString = "";

        final Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        final JTextArea textArea = new JTextArea(14,20);

        textArea.setFont(textAreaFont);

        text += String.format("%-10s%-10s\n","Month","Rainfall");

        for (i = 0; i < rainfall.length; i++)
            text += String.format("%-10d%-10d\n",(i+1), rainfall[i]);

        textArea.append(text);

        JOptionPane.showMessageDialog(null,textArea,"Rainfall Stats",
        JOptionPane.PLAIN_MESSAGE);

        monthAsString = JOptionPane.showInputDialog("Please enter a month number" +
        " (1-12) ");

        month = Integer.parseInt(monthAsString);

        while(month>12||month<1)
        {
                monthAsString = JOptionPane.showInputDialog("That is not a valid month, please try again");
                month = Integer.parseInt(monthAsString);
        }
        
        JOptionPane.showMessageDialog(null,"Rainfall for this month is : " +
        rainfall[month-1] + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE);

        winterRainfall = rainfall[0] + rainfall[10] + rainfall[11];

        JOptionPane.showInputDialog(null,"Total rainfall for the winter months is: " +
        winterRainfall + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE);

        springRainfall = rainfall[1] + rainfall[2] + rainfall[3];

        JOptionPane.showInputDialog(null,"Total rainfall for the spring months is: " +
        springRainfall + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE);

        for (i = 0; i <= 5; i++)
        janToJuneRainfall += rainfall[i];

        JOptionPane.showMessageDialog(null,"Total rainfall from January to June is: " +
        janToJuneRainfall + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE);
    }
}