public class leap{

    public static boolean isLeapYear(int y)
    {
        if((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int year = Integer.parseInt(args[0]);

        if(isLeapYear(year))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is NOT a leap year.");
        }
    }
}
