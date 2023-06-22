package data;

public class Bus implements Car
{
    @Override
    public void drive()
    {
        System.out.println("Bus going");
    }

    public int getTier()
    {
        return 8;
    }

    @Override
    public String getBrand()
    {
        return "Hino";
    }

    @Override
    public boolean isBig()
    {
        return true;
    }
    public boolean isMaintenance()
    {
        return false;
    }
}
