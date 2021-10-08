package labsheet5.exercise3;

public class Thermometer {
    private int currentTemp;
    private int maximumTemp;
    private int minimumTemp;

    public Thermometer() {
    setCurrentTemp(0);
    setMaximumTemp(Integer.MIN_VALUE);
    setMinimumTemp(Integer.MAX_VALUE);
    }

    public Thermometer(int currentTemp)
    {
        setCurrentTemp(currentTemp);
        setMaximumTemp(currentTemp);
        setMinimumTemp(currentTemp);
    }

    public void setCurrentTemp(int currentTemp)
    {
      this.currentTemp = currentTemp;
    }

    public int getCurrentTemp()
    {
        return currentTemp;
    }

    public void setMaximumTemp(int maximumTemp)
    {
        this.maximumTemp = maximumTemp;
    }

    public int getMaximumTemp()
    {
        return maximumTemp;
    }

    public void setMinimumTemp(int minimumTemp)
    {
        this.minimumTemp = minimumTemp;
    }

    public void setTemp(int currentTemp)
    {
        setCurrentTemp(currentTemp);
        updateMaxMinTemp();
    }

    public int getMinimumTemp()
    {
        return minimumTemp;
    }

    public void updateMaxMinTemp()
    {
        if (currentTemp > maximumTemp)
            maximumTemp = currentTemp;

        if (currentTemp < minimumTemp)
            minimumTemp = currentTemp;
    }


    public String toString()
    {
        return "Current Temperature: " + getCurrentTemp() + "\nMaximum Temperature: " + getMaximumTemp() + "\nMinimum Temperature: " + getMinimumTemp();
    }

}
