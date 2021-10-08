//Exercise2.java

import javax.swing.JOptionPane;

public class Exercise2{
    public static void main(String args[])   
    {
    String Number;
    boolean valid=false;

    Number = JOptionPane.showInputDialog(null,"Please enter a 16-digit card number");

    while(!valid)
        {
        if(Number.length()!=16)  
            Number = JOptionPane.showInputDialog(null,"The debit card number is not the correct length"); 
        else 
            {
            if(Number.charAt(0)!='4')
                Number = JOptionPane.showInputDialog(null,"The debit card number does not begin with a 4");
            else               
               {
                for(int i=0;i<16;i++)
                    {
                    while(!Character.isDigit(Number.charAt(i)))      
                    Number = JOptionPane.showInputDialog(null,"The debit card number doesn't have all digits");  
                    }

                    Character.getNumericValue(Number.charAt(0));
                    JOptionPane.showMessageDialog(null,"be" + (Number.charAt(0)+Number.charAt(0)));
                           
               }                     
            }
        }   
        JOptionPane.showMessageDialog(null,"Correct");
            
    }
}