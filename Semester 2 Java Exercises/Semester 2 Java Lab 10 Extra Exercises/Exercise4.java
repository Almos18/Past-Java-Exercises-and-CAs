//Exercise4.java

import javax.swing.JOptionPane;

public class Exercise4
{
    public static void main(String args[])
    {
        String date, datesIn1960s="";

        date = JOptionPane.showInputDialog(null,"Please enter a date of birth in " +
        "the form dd-mm-yyyy(x to exit):","Input",JOptionPane.PLAIN_MESSAGE);

     while(!date.equals("x"))
        {
            while(!date.equals("x") && !isValidDateOfBirth(date))
            date = JOptionPane.showInputDialog(null,"Invalid. Please re-enter the date " +
            "of birth in the form dd-mm-yyyy(x to exit):","Input",JOptionPane.PLAIN_MESSAGE);

            if(!date.equals("x"))
            {
                if(date.charAt(6)=='1' && date.charAt(7)=='9' && date.charAt(8)=='6')
                    datesIn1960s += date + "\n";

                date = JOptionPane.showInputDialog(null,"Please enter another date of birth in " +
                    "the form dd-mm-yyyy(x to exit):","Input",JOptionPane.PLAIN_MESSAGE);
            }
        }
    JOptionPane.showMessageDialog(null,"the dates in the 1960s are: \n\n" + datesIn1960s,"1960s Dates",JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);


    }


    public static boolean isValidDateOfBirth(String d)
    {
        boolean valid=false;

        if(
          ((d.charAt(0)>='0' && d.charAt(0)<='2') && (d.charAt(1)>='1' && d.charAt(1)<='9') ||
          (d.charAt(1)>='0' && d.charAt(1)<='1' && d.charAt(0)=='3')) && d.charAt(2)=='-' &&
          ((d.charAt(3)=='0' && d.charAt(4)>='0' && d.charAt(4)<='9') || (d.charAt(3)=='1' &&
          d.charAt(4)>='0' && d.charAt(4)<='2')) && d.charAt(5)=='-' && ((d.charAt(6)>='0' &&
          d.charAt(6)<='9') && (d.charAt(7)>='0' && d.charAt(7)<='9') && (d.charAt(8)>='0' &&
          d.charAt(8)<='9') && (d.charAt(9)>='0' && d.charAt(9)<='9')) && d.length()==10
          )
        {
        return valid=true;
        }

        else
        {
        return valid=false;
        }

    }
}