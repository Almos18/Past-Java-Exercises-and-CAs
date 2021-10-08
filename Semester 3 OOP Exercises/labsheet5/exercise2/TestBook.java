package labsheet5.exercise2;

import labsheet3.exercise1.Computer;

import javax.swing.*;

public class TestBook {

    public static void main(String args[])
    {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no argument Book constructor. The first Book object details are:\n" + b1.setString();

        Book b2 = new Book("The Davinci Code", 19.99, "3452617232", 348);

        output += "\n\nCalling the no argument Book constructor. The first Book object details are:\n" + b2.setString();

        JOptionPane.showMessageDialog(null, output,"Book Object Data", JOptionPane.INFORMATION_MESSAGE);

        Computer c1 = new Computer();

        System.out.println(c1.getManufacturer());

        System.exit(0);
    }
}
