package Application;

public class StackTraceApp
{
    public static void main(String[] args)
    {

        try
        {
            String []names = {
                    "agung ", "kurniawan", "khanediy"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable)
        {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}
