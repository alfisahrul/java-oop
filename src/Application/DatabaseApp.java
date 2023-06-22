package Application;

import error.DatabaseError;

public class DatabaseApp
{
    public static void main(String[] args)
    {
        connectDatabase("admin",null);
        System.out.println("succed");
    }
    public static void connectDatabase (String username, String password)
    {
        if (username == null || password == null)
        {
            throw new DatabaseError(" Tidak bisa terkoneksi");
        }
    }
}
