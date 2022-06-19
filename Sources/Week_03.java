////////////////////////
///// Week_03.java /////
////////////////////////

import java.util.Scanner;

public class Week_03
{
    //////////////////////////
    ///// March 17, 2021 /////
    //////////////////////////

    public void Solution01()
    {
        byte b = 127;
        int i = 100;

        System.out.println(b + i);
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b + i));
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }

    public void Solution02()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.next();

        System.out.print("Enter your hometown : ");
        String hometown = sc.next();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your weight : ");
        double weight = sc.nextDouble();

        System.out.print("Do you have lover? : ");
        boolean lover = sc.nextBoolean();

        sc.close();

        System.out.println("\nName : " + name);
        System.out.println("Hometown : " + hometown);
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);
        System.out.println("Have Lover? : " + lover);
    }

    //////////////////////////
    ///// March 19, 2021 /////
    //////////////////////////

    public void Solution03()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int time = sc.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        sc.close();

        System.out.print(time + " seconds = ");
        System.out.print(hour + " hours, ");
        System.out.print(minute + " minutes, ");
        System.out.print(second + " seconds");
        System.out.println();
    }

    public void Solution04()
    {
        int a = 3, b = 3, c = 3;

        a += 3;
        b *= 3;
        c %= 2;

        System.out.println("a : " + a + "b : " + b + "c : " + c);

        int d = 3;

        a = d++;
        System.out.println("a : " + a + "d : " + d);
        a = ++d;
        System.out.println("a : " + a + "d : " + d);
        a = d--;
        System.out.println("a : " + a + "d : " + d);
        a = --d;
        System.out.println("a : " + a + "d : " + d);
    }

    public void Solution05()
    {
        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2));

        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
    }
}
