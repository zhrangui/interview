using System;

public static class Shipping
{
    public static int MinimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages)
    {
        int max = 5;
        int min = 1;
        int package = 0;

        if (items <= availableLargePackages * max)
        {
            package = items / (max);
            if (items> package*max) {
                package++;
            }
        }
        else
        {
            package = availableLargePackages;
            items = items - package * max;
            if (items <= availableSmallPackages)
            {
                package += items;
            }
            else
            {
                package = -1;
            }
        }

        return package;
    }

    public static void Main(string[] args)
    {
        Console.WriteLine(Shipping.MinimalNumberOfPackages(13, 3, 10));
    }
}