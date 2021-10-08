package labsheet4.exercise5;

import javax.swing.*;
import java.awt.*;

public class TestBook {

    public static void main(String args[])
    {
        String output = "", title, ISBN;
        double price;
        int pages;

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("Title","Price","ISBN","Pages"));

        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of pages of your favourite book"));

        Book b2 = new Book(title,price,ISBN,pages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d",b2.getTitle(),b2.getPrice(),
                b2.getISBN(),b2.getPages());

        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of pages of your least favourite book"));

        Book b3 = new Book(title,price,ISBN,pages);

        output += String.format("\n\n%-25s%-9.2f%-15s%d",b3.getTitle(),b3.getPrice(),
                b3.getISBN(),b3.getPages());

        JOptionPane.showMessageDialog(null, "Title                                    Price        ISBN                                pages" + output,"Book Object Data",
        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
