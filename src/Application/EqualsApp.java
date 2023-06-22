package Application;

public class EqualsApp
{
    public static void main(String[] args)
    {
        String first = "Eko";
        first = first + " " + "Budi";

        System.out.println(first);

        String second = "Eko Budi";

        System.out.println(second);
        System.out.println(first.equals(second));

        System.out.println(first == second);
    }

}
