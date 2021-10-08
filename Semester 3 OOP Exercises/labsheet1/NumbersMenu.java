package labsheet1;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class NumbersMenu {

    public static void main(String args[])
    {
        int wholeNumber=0, choice=0, i=1;
        String wholeNumberAsString, choiceAsString, evenOrOdd;
        float wholeNumberAsFloatItsIronic;


        while(choice!=3 && i!=11)
        {
            wholeNumberAsString = JOptionPane.showInputDialog(null, "----------Iteration " + i + "----------" +
                    "\n\nPlease enter any whole number:", "Input", JOptionPane.QUESTION_MESSAGE);
            wholeNumberAsFloatItsIronic = Float.parseFloat(wholeNumberAsString);
            wholeNumber = Integer.parseInt(wholeNumberAsString);

            choiceAsString = JOptionPane.showInputDialog(null,"What would you like to do?" +
                    "\n1. Determine if the number is odd or even" +
                    "\n2. Find the factorial of the number" +
                    "\n3. Quit the program" +
                    "\n\nPlease enter your choice:","Input",JOptionPane.QUESTION_MESSAGE);
            choice = Integer.parseInt(choiceAsString);
            i++;

            switch(choice) {
                case 1:

                    if (wholeNumberAsFloatItsIronic/2 == wholeNumber/2 ) {
                        evenOrOdd = "even";
                    } else
                        evenOrOdd = "odd";
                    JOptionPane.showMessageDialog(null, "The number you have entered is " + evenOrOdd,
                            "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    int k = 2;
                    double factorial = 2, factorialTest = 0, factorial1 = 1;
                    for (int j = 0; j < wholeNumber - 1; j++) {
                        factorialTest = (k * (factorial1));
                        factorial1 = factorialTest;
                        factorial = factorialTest;
                        k++;
                    }

                    if (wholeNumber > 0)
                        JOptionPane.showMessageDialog(null, "The factorial of the number you entered " + factorial, "Number Data", JOptionPane.INFORMATION_MESSAGE);

                    else
                        JOptionPane.showMessageDialog(null, "Cannot get the factorial of a negative number!", "Number Data", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        if(choice==3)
        {
            JOptionPane.showMessageDialog(null, "Quitting the program earlier than anticipated... Goodbye", "Number Data", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else
            System.exit(0);
    }
}