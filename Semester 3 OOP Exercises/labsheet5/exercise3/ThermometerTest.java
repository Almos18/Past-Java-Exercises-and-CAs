package labsheet5.exercise3;

import javax.swing.*;

public class ThermometerTest {
    public static void main(String[] args)
    {
        String output = "";
        int temp;

        Thermometer t1 = new Thermometer(35);

        output += "*****Thermometer Testing*****\n\nCalling the single argument constructor... Setting the temperature of the first thermometer to 35C " +
                "\nFirst Thermometer:\n" + t1.toString();

        Thermometer t2 = new Thermometer();

        output += "\n\nCalling the no argument constructor... Setting the temperature of the second thermometer to 0C " +
                "\nSecond Thermometer:\n" + t2.toString();

        t2.setTemp(25);

        output += "\n\nCalling setTemperature()... Setting the temperature of the second thermometer to 25C " +
                "\nSecond Thermometer:\n" + t2.toString();

        JOptionPane.showMessageDialog(null,output);

        temp = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the current temperature of the first thermometer: "));

        JOptionPane.showMessageDialog(null,"\n\nCalling setTemperature()... Setting the temperature of the first thermometer to " + temp +
                "C");

        t1.setTemp(temp);

        output += "\n\nFirst Thermometer: \n" + t1;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + output,"",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
