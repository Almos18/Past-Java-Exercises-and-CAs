package labsheet5.exercise5;

import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args)
    {
        String output = "";

        BankAccount b1 = new BankAccount();

        b1.setNumber(BankAccount.getCount());

        output += "Calling the no argument bank account constructor. The first Bank account objects are: \n\n" + b1.toString();

        BankAccount b2 = new BankAccount("Ricky Rich", 0.75);

        output += "\n\nCalling the no argument bank account constructor. The second Bank account objects are: \n\n" + b2.toString();

        output += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5";

        b1.setInterestRate(0.5);

        output += "\n\nThe first BankAccount object details are: \n\n" + b1.toString();

        output += "\n\nThe second bank account object details are: \n\n" + b2.toString();

        output += "\n\nThe number of bank objects created is: " + BankAccount.getCount();

        JOptionPane.showMessageDialog(null,output);

    }
}
