package com.company;

import java.util.Scanner;

public class Main
{
    static double d1 = 0;
    static double d2 = 0;
    static double d3 = 0;

    static double[] dArray = new double[3];

    static Scanner input = new Scanner(System.in);

    static void ConsoleWriteLine(String str)
    {
        System.out.println(str);
    }
    static void ConsoleWrite(String str)
    {
        System.out.print(str);
    }

    static double ReadDouble()
    {

        double d = 0;
        try
        {
            d = input.nextDouble();
        }
        catch (NumberFormatException e)
        {
            ConsoleWriteLine("Invalid input!!!");
        }

        return d;
    }

    public static void main(String[] args)
    {
	// write your code here

        for (int i = 0; i < dArray.length; i++ )
        {
            ConsoleWrite("Input digit number " + (i+1) + ": ");
            dArray[i] = ReadDouble();
            ConsoleWriteLine("");
        }
        boolean RUN = true;

        do
        {
            if (dArray[0] >= dArray[1] && dArray[0] >= dArray[2])
            {
                ConsoleWriteLine("The largest number is:");
                ConsoleWriteLine(Double.toString(dArray[0]));

                if (dArray[1] >= dArray[2])
                {
                    ConsoleWriteLine("The second largest number is:");
                    ConsoleWriteLine(Double.toString(dArray[1]));
                    ConsoleWriteLine("The smallest number is:");
                    ConsoleWriteLine(Double.toString(dArray[2]));
                }
                else
                {
                    ConsoleWriteLine("The second largest number is:");
                    ConsoleWriteLine(Double.toString(dArray[2]));
                    ConsoleWriteLine("The smallest number is:");
                    ConsoleWriteLine(Double.toString(dArray[1]));
                }
                RUN = false;
            }
            if(dArray[1] >= dArray[0] && dArray[1] >= dArray[2])
            {
                ConsoleWriteLine("The largest number is:");
                ConsoleWriteLine(Double.toString(dArray[1]));

                if (dArray[0] >= dArray[2])
                {
                    ConsoleWriteLine("The second largest number is:");
                    ConsoleWriteLine(Double.toString(dArray[0]));
                    ConsoleWriteLine("The smallest number is:");
                    ConsoleWriteLine(Double.toString(dArray[2]));
                }
                else
                {
                    ConsoleWriteLine("The second largest number is:");
                    ConsoleWriteLine(Double.toString(dArray[2]));
                    ConsoleWriteLine("The smallest number is:");
                    ConsoleWriteLine(Double.toString(dArray[0]));
                }
                RUN = false;
            }
            if(dArray[2] >= dArray[0] && dArray[2] >= dArray[1])
            {
                ConsoleWriteLine("The largest number is:");
                ConsoleWriteLine(Double.toString(dArray[2]));

                if (dArray[0] >= dArray[1])
                {
                    ConsoleWriteLine("The second largest number is:");
                    ConsoleWriteLine(Double.toString(dArray[0]));
                    ConsoleWriteLine("The smallest number is:");
                    ConsoleWriteLine(Double.toString(dArray[1]));
                }
                else
                {
                    ConsoleWriteLine("The second largest number is:");
                    ConsoleWriteLine(Double.toString(dArray[1]));
                    ConsoleWriteLine("The smallest number is:");
                    ConsoleWriteLine(Double.toString(dArray[0]));
                }
                RUN = false;
            }
        }while(RUN == true);


    }
}
