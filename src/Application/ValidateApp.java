package Application;

import data.LoginRequest;
import error.ValidationException;
import error.ValidationUtil;

public class ValidateApp
{
    public static void main(String[] args)
    {
        LoginRequest loginRequest = new LoginRequest("al","fi");
        LoginRequest loginRequest1 = new LoginRequest("hallo","hihi");

        System.out.println("Sukses");
        try
        {
            ValidationUtil.validate(loginRequest);
            ValidationUtil.validateRuntime(loginRequest1);
            System.out.println("Data valid");
        }
        catch (ValidationException e)
        {
            System.out.println("Terjadi error "+ e.getMessage());
        }



    }
}
