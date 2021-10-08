package labsheet5.exercise4;

public class BankAccount {
    private String Owner;
    private int Number;
    private static double interestRate;

    public BankAccount()
    {
     this("Owner Not Available",0,0.0);
    }

    public BankAccount(String Owner, int Number, double interestRate)
    {
        setOwner(Owner);
        setNumber(Number);
        setInterestRate(interestRate);
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

    public String toString()
    {
        return " Owner: " + getOwner() + " Account Number: " + getNumber() + " Interest Rate: " + getInterestRate();
    }
}
