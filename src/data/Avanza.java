package data;

public class Avanza implements Car,isMaintenance
{

    public void drive()
    {
        System.out.println("Avanza drive");
    }


    public int getTier()
    {
        return 4;
    }

    @Override
    public String getBrand()
    {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance()
    {
        return false;
    }
}
