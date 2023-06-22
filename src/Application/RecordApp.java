package Application;

import data.LoginRequest;

public class RecordApp
{
    public static void main(String[] args)
    {
        LoginRequest loginRequest = new LoginRequest("al","el");

        System.out.println(loginRequest);

    }
}
