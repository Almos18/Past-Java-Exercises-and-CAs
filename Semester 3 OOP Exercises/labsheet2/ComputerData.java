package labsheet2;

import javax.swing.JOptionPane;

public class ComputerData {

    public static void main(String args[])
    {
        int hardDiskSpace=0, computerAdded=0;
        String serialNumber, hardDiskSpaceAsString, type, priceAsString, cheapestProcessor="";
        boolean valid = false;
        float price, lowestPrice=999999999, highestPrice=0;

        serialNumber = JOptionPane.showInputDialog(null, "Please enter the serial number (<CR> to exit)",
                "Input", JOptionPane.QUESTION_MESSAGE);

        while (!valid==true)
        {
            if(serialNumber.equals(""))
            {
               System.exit(0);
            }
            else
                while (serialNumber.length() > 90000)
                {
                    serialNumber = JOptionPane.showInputDialog(null, "Invalid! Please re-enter serial number",
                        "Input", JOptionPane.QUESTION_MESSAGE);
                }

                    hardDiskSpaceAsString = JOptionPane.showInputDialog(null, "Please enter the hard disk space",
                        "Input", JOptionPane.QUESTION_MESSAGE);


                        /*while(hardDiskSpaceAsString.charAt(0)!='0' && hardDiskSpaceAsString.charAt(0)!='1' && hardDiskSpaceAsString.charAt(0)!='2' &&
                                hardDiskSpaceAsString.charAt(0)!='3' && hardDiskSpaceAsString.charAt(0)!='4' && hardDiskSpaceAsString.charAt(0)!='5' &&
                                hardDiskSpaceAsString.charAt(0)!='6' && hardDiskSpaceAsString.charAt(0)!='7' && hardDiskSpaceAsString.charAt(0)!='8' &&
                                hardDiskSpaceAsString.charAt(0)!='9')
                        {
                            hardDiskSpaceAsString = JOptionPane.showInputDialog(null, "Invalid! please re-enter the hard disk space",
                                "Input", JOptionPane.QUESTION_MESSAGE);
                        }*/

                            hardDiskSpace = Integer.parseInt(hardDiskSpaceAsString);

                            while(hardDiskSpace < 50 || hardDiskSpace > 5000)
                            {
                            hardDiskSpaceAsString = JOptionPane.showInputDialog(null, "Invalid! please re-enter the hard disk space",
                                "Input", JOptionPane.QUESTION_MESSAGE);
                            hardDiskSpace = Integer.parseInt(hardDiskSpaceAsString);
                            }

                            type = JOptionPane.showInputDialog(null, "Please enter processor type",
                                "Input", JOptionPane.QUESTION_MESSAGE);

                            priceAsString = JOptionPane.showInputDialog(null, "Please enter the price",
                                "Input", JOptionPane.QUESTION_MESSAGE);
                            price = Float.parseFloat(priceAsString);

                                if(price < lowestPrice)
                                {
                                    lowestPrice = price;
                                    cheapestProcessor = type;
                                }
                                if(price >highestPrice)
                                {
                                    highestPrice = price;
                                }

                                computerAdded++;

                                    serialNumber = JOptionPane.showInputDialog(null, "Please enter the serial number (<CR> to exit)",
                                        "Input", JOptionPane.QUESTION_MESSAGE);
                                        if(serialNumber.equals(""))
                                        {
                                            valid=true;
                                        }
        }

        JOptionPane.showMessageDialog(null,"The average disk space available on the computers processed is: " +
                averageDiskSpace(hardDiskSpace,computerAdded) + "GB" + "\nThe price range of the computers is from €" + lowestPrice + " to €" + highestPrice +
                "\nThe processor type on the cheapest computer is " + cheapestProcessor, "Computer Stats",JOptionPane.INFORMATION_MESSAGE);
    }

    public static int averageDiskSpace(int hardDiskSpace, int computerAdded)
    {
        int averageDiskSpaceAsInt = (hardDiskSpace/computerAdded);
        return averageDiskSpaceAsInt;
    }
}