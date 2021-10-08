//Exercise2.java

import javax.swing.JOptionPane;

public class Ecercise2 {
    public static void main(String args[])
    {
        int choice;

        choice = JOptionPane.showConfirmDialog(null,
        "Take your pick - yes, no or cancel", 
        "Select an option",JOptionPane.YES_NO_CANCEL_OPTION);

        if(choice == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null,"You chose yes", "Yes Option",JOptionPane.INFORMATION_MESSAGE);

        else if(choice == JOptionPane.NO_OPTION)
            JOptionPane.showMessageDialog(null,"You chose no","No Option",JOptionPane.INFORMATION_MESSAGE);

        else if(choice == JOptionPane.CANCEL_OPTION)
            JOptionPane.showMessageDialog(null,"You chose cancel","Cancel Option",JOptionPane.INFORMATION_MESSAGE);
            
        else
            JOptionPane.showMessageDialog(null,"You exited the program","Exit Option",JOptionPane.INFORMATION_MESSAGE);

    }

}