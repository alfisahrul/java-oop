package util;

public class MathUtil
{
    public static int sum(int... values)
    {
        int tot = 0;
        for (var value: values)
        {
            tot += value;
        }
        return tot;
    }
}
