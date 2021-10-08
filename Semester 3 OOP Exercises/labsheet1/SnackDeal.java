package labsheet1;

import javax.swing.JOptionPane;

public class SnackDeal {
    public static void main(String args[])
    {
        String name, course, snacksAsString;
        int snacks;

        name = JOptionPane.showInputDialog(null,"Please enter your name",
                "Input",JOptionPane.QUESTION_MESSAGE);

        course = JOptionPane.showInputDialog(null,"Please enter your course",
                "Input",JOptionPane.QUESTION_MESSAGE);

        snacksAsString = JOptionPane.showInputDialog(null,"How many snacks would you like?",
                "Input",JOptionPane.QUESTION_MESSAGE);
        snacks = Integer.parseInt(snacksAsString);

        JOptionPane.showMessageDialog(null,"Name: " +
                name + "\nCourse: " + course + "\nSnacks: " + snacks + "\nCost: €"  + snacks*2,"Receipt",JOptionPane.INFORMATION_MESSAGE);
    }
}