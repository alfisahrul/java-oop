package Application;

import data.Constant;
import data.Country;
import util.MathUtil;

public class StaticApp
{
    public static void main(String[] args)
    {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1)
        );
        Country.City city = new Country.City();
        System.out.println("Banten");

    }
}
