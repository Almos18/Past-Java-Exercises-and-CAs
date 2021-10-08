package labsheet8.exercise2;

public class Validator
{
    public static boolean isValidRegistrationNumber(String registrationNumber)
    {
        if(registrationNumber.length()<=12&&registrationNumber.length()>=6)
        {
            if(Character.isDigit(registrationNumber.charAt(0)) && Character.isDigit(registrationNumber.charAt(1)));
            {
                if(registrationNumber.charAt(2)==('-'))
                {
                    if((Character.isUpperCase(registrationNumber.charAt(3)) && Character.isUpperCase(registrationNumber.charAt(4)) && registrationNumber.charAt(5)==('-')) ||
                      (Character.isUpperCase(registrationNumber.charAt(3)) && registrationNumber.charAt(4)==('-') && Character.isDigit(registrationNumber.charAt(5))))
                    {
                        for(int i=6;i<registrationNumber.length();i++)
                        {
                            if(!Character.isDigit(registrationNumber.charAt(i)))
                            {
                               return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}