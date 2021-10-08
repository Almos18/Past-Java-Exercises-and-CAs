package labsheet5.exercise5;

public class BankAccount {
    private String Owner;
    private int Number;
    private static double interestRate;
    private static int count;

    public BankAccount()
    {
     this("Owner Not Available", 0.0);
    }

    public BankAccount(String Owner, double interestRate)
    {
        incrementCount();
        setOwner(Owner);
        setNumber(count);
        setInterestRate(interestRate);
    }

    private static void incrementCount()
    {
        count++;
    }

    public void setOwner(String Owner)
    {
        this.Owner = Owner;
    }

    public String getOwner()
    {
        return Owner;
    }

    public void setNumber(int Number)
    {
        this.Number = Number;
    }

    public int getNumber()
    {
        return Number;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public static double getInterestRate()
    {
        return interestRate;
    }

    public static int getCount()
    {
        return count;
    }

    public String toString()
    {
        return " Owner: " + getOwner() + " Account Number: " + getNumber() + " Interest Rate: " + getInterestRate();
    }
}
