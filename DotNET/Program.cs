// See https://aka.ms/new-console-template for more information
using System;
class MalwareAnalysis
{
    public static int[] Simulate(int[] entries)
    {
        int l = 3;
        int r = 4;
        int len = entries.Length;
        int[] mal = new int[len];

        for (int i = 0; i < len; ++i)
        {
            if (i > l && (entries[i] <= entries[i - l]))
            {
                mal[i] = 0;
            }
            else if (i + r < len && entries[i] <= entries[i + r])
            {

                mal[i] = 0;
            }
            else
            {
                mal[i] = entries[i];
            }
        }
        return mal;
    }

    public static void Main(string[] args)
    {
        int[] records = new int[] { 1, 2, 0, 5, 0, 2, 4, 3, 3, 3 };
        var result = Simulate(records);
        Console.WriteLine(string.Join(", ", result));
    }
}