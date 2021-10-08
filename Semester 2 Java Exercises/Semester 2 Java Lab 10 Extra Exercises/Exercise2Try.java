//Exercise2.java

import javax.swing.JOptionPane;

public class Exercise2Try{
    public static void main(final String args[])   
    {
    String Number;
    boolean valid=false;

    Number = JOptionPane.showInputDialog(null,"Please enter a 16-digit card number");

    while(!valid)
        {
        if(Number.length()==16)           
            {
            if(Number.charAt(0)=='2')               
               {
                for(int i=0;i<16;i++)
                    if(!Character.isDigit(Number.charAt(i)))
                    break;
                    {
                    if(Number.charAt(0)*2==8);
                        {
                        valid=true;
                        }
                    }
                    
               }
            else
                {
                Number = JOptionPane.showInputDialog(null,"The debit card number does not begin with a 4");
                }     
            }
        else
            {
            Number = JOptionPane.showInputDialog(null,"The debit card number is not the correct length");
            }
        }

        JOptionPane.showMessageDialog(null,"Correct");
            
    }
}