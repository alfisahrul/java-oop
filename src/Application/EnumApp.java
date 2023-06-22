package Application;

import data.Customer;
import data.Level;

public class EnumApp
{
    public static void main(String[] args)
    {
        Customer customer = new Customer();
        customer.setName("alfi");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);


    }
}
