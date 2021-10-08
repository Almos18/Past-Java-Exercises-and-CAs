package labsheet8.exercise1;

public class Bicycle extends Vehicle{
    private int gearCount;
    private boolean hasBell;

    public Bicycle()
    {
        setGearCount(0);
        setHasBell(false);
    }

    public Bicycle(double pri, double len, double hei, double wei, String manu, String mod, int gearC, boolean hasB)
    {
        super(pri, len, hei, wei, manu, mod);
        setGearCount(gearC);
        setHasBell(hasB);
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearC) {
        gearCount = gearC;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasB) {
        hasBell = hasB;
    }

    @Override
    public String toString() {
        String str = super.toString() + "\nGearCount " + getGearCount() + "\nhasBell ";

        if(isHasBell())
            str+="Yes";
        else
            str+="No";
        return str;
    }
}