//Exercise1.java

import javax.swing.JOptionPane;

public class Exercise1
{
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null, "This message dialog uses an error message icon", "Error!", 
        JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null,"This message dialog uses a warning message icon", "Warning!",
        JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "This message dialog uses a question message icon", "Question!", 
        JOptionPane.QUESTION_MESSAGE);

        
        /*Object[] options = {"OK"};
        JOptionPane.showOptionDialog(null, "This message dialog uses a warning message icon", "Warning!", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
        null, options, options[0]);*/

        //JOptionPane.showInternalMessageDialog(frame, "information",
        //"information", JOptionPane.INFORMATION_MESSAGE);
    }
}