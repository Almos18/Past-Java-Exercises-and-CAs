//Exercise3.java

import javax.swing.JOptionPane;

public class Exercise3{
    public static void main(String args[])
    {
            String telephone, totalTelephone="";
            boolean valid=false;
            int j=5;
       
            for(int i=1;i<6;i++)
            {
                telephone = JOptionPane.showInputDialog(null,"Loop " + i + " Please enter phone number","Input",JOptionPane.INFORMATION_MESSAGE);

                valid=false;

                while(!valid)
                    {
                        if(telephone.length()==12)
                            {
                                if(telephone.charAt(0)=='(' && telephone.charAt(1)=='0')
                                {
                                    if(telephone.charAt(2)>='2' && telephone.charAt(2)<='6')
                                    {
                                        if(telephone.charAt(3)>='0' && telephone.charAt(3)<='9')
                                        {
                                            if(telephone.charAt(4)==')')
                                            {
                                                for(j=5;j<12;j++)
                                                    if(!Character.isDigit(telephone.charAt(j)))
                                                        break;

                                                if(j==12)
                                                {
                                                    totalTelephone+=telephone + "\n";
                                                    valid=true;
                                                }

                                                else{
                                                    telephone = JOptionPane.showInputDialog(null,"Invalid. Last 7 characters are not all digits");
                                                    }                               
                                            }
                                            else
                                            telephone = JOptionPane.showInputDialog(null,"Invalid. Fifth character must be a )");
                                        }
                                        else
                                        telephone = JOptionPane.showInputDialog(null,"Invalid. Fourth character must be between 0 and 9");
                                    }
                                    else
                                    telephone = JOptionPane.showInputDialog(null,"Invalid. The third character must be between 2 and 6");    
                                }
                                else 
                                telephone = JOptionPane.showInputDialog(null,"Invalid. It must start with (0"); 
                            }
                        else
                        telephone = JOptionPane.showInputDialog(null,"Invalid. It must have exactly 12 characters");
                    }
                }

                JOptionPane.showMessageDialog(null,"The list of valid phone numbers is\n\n" + totalTelephone);
                System.exit(0);

    }
}