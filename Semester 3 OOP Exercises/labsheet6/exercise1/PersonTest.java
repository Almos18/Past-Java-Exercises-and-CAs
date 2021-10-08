package labsheet6.exercise1;
import javax.swing.*;

public class PersonTest {
    public static void main(String[] args) {

        String output = "";
        String firstName, lastName;

        firstName = JOptionPane.showInputDialog(null,"Please enter the first name of the second person");

        lastName = JOptionPane.showInputDialog(null,"Please enter the last name of the second person");

        output += "******Person Class Tester******\n\n";

        Person P1 = new Person();

        output += "Calling the Person() constructor .....\nThe value of the first person object is " + P1.toString();

        Person P2 = new Person(firstName, lastName);

        output += "Calling the Person() constructor .....\nThe value of the first person object is " + P2.toString();

        JOptionPane.showMessageDialog(null, output);
    }
}
