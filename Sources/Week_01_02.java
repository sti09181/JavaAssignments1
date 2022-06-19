///////////////////////////
///// Week_01_02.java /////
///////////////////////////

import java.util.Scanner;

public class Week_01_02
{
    //////////////////////////
    ///// March 12, 2021 /////
    //////////////////////////

    public void Solution01()
    {
        int integer;
        int binary = 0;
        int multiplier = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        integer = sc.nextInt();

        sc.close();

        while (integer != 0)
        {
            int reminder = integer % 2;
            integer /= 2;
            binary += reminder * multiplier;
            multiplier *= 10;
        }

        System.out.println("Binary representation : " + binary);
    }

    public void Solution02()
    {
        final double PI = 3.14159265358979323846;

        double radius = 10.0;
        double circleArea = radius * radius * PI;

        System.out.println("Area of the circle : " + circleArea);
    }
}
