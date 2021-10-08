package labsheet5.exercise1;

import javax.swing.*;
import labsheet3.exercise1.Computer;

public class TestBook {

    public static void main(String args[])
    {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no argument Book constructor. The first Book object details are:\n" + b1.setString();

        Book b2 = new Book("The Davinci Code", 19.99, "3452617232", 348);

        output += "\n\nCalling the no argument Book constructor. The first Book object details are:\n" + b2.setString();

        JOptionPane.showMessageDialog(null, output,"Book Object Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
