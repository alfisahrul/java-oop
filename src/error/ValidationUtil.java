package error;

import data.LoginRequest;

public class ValidationUtil
{
    public static void validate (LoginRequest loginRequest) throws ValidationException
    {
        if (loginRequest.username() == null)
        {
            throw  new ValidationException("Username is null");
        } else if (loginRequest.username().isBlank())
        {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.username() == null)
        {
            throw new ValidationException("Password is null");
        } else if (loginRequest.username().isBlank())
        {
            throw new ValidationException("Password is blank");
        }



    }

    public static void validateRuntime (LoginRequest loginRequest) throws ValidationException
    {
        if (loginRequest.username() == null)
        {
            throw  new ValidationException("Username is null");
        } else if (loginRequest.username().isBlank())
        {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.username() == null)
        {
            throw new ValidationException("Password is null");
        } else if (loginRequest.username().isBlank())
        {
            throw new ValidationException("Password is blank");
        }





    }
    public static void validateReflection(Object object)
    {

    }

}
