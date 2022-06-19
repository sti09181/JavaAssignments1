////////////////////////
///// Week_04.java /////
////////////////////////

import java.util.Scanner;

public class Week_04
{
    //////////////////////////
    ///// March 24, 2021 /////
    //////////////////////////

    public void Solution01()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score : ");
        int score = sc.nextInt();

        sc.close();

        if (score >= 80)
            System.out.println("You're PASSED!");
    }

    public void Solution02()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = sc.nextInt();

        sc.close();

        if (number % 3 == 0)
            System.out.println("This number is a multiple of 3");
        else
            System.out.println("This number is not a multiple of 3");
    }

    public void Solution03()
    {
        int a = 3, b = 5;

        System.out.println("The subtraction of two numbers is " + ((a > b) ? (a - b) : (b - a)));
    }

    public void Solution04()
    {
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score : ");
        int score = sc.nextInt();

        sc.close();

        if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Your grade is " + grade);
    }

    public void Solution05()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score : ");
        int score = sc.nextInt();

        System.out.print("Enter your grade (1 ~ 4) : ");
        int year = sc.nextInt();

        sc.close();

        if (year > 4 || year < 1)
            System.out.println("Enter your school/academic year properly");

        if (score >= 60)
        {
            if (year == 4 && score >= 70)
                System.out.println("You're PASSED!");
            else if (year == 4)
                System.out.println("You're FAILED!");
            else
                System.out.println("You're PASSED!");
        }
        else
            System.out.println("You're FAILED!");
    }

    public void Solution06()
    {
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score : ");
        int score = sc.nextInt();

        sc.close();

        grade = switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        System.out.println("Your grade is " + grade);
    }

    public void Solution07()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("What kind of coffee would you like to have? : ");
        String coffee = sc.next();

        int price = switch (coffee) {
            case "Espresso", "Cappuccino", "Latte" -> 3500;
            case "Americano" -> 2000;
            default -> 0;
        };

        if (price != 0)
            System.out.println(coffee + " costs " + price + " won");

        sc.close();
    }

    //////////////////////////
    ///// March 26, 2021 /////
    //////////////////////////

    public void Solution08()
    {
        int sum = 0;

        for (int i = 1; i <= 10; i++)
        {
            sum += 1;
            System.out.print(i);

            if (i <= 9)
                System.out.print("+");
            else {
                System.out.print("=");
                System.out.print(sum);
            }
        }
    }

    public void Solution09()
    {
        int count = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers, then put -1 at the end : ");

        int n = sc.nextInt();
        while (n != -1)
        {
            sum += n;
            count++;
            n = sc.nextInt();
        }

        sc.close();

        if (count == 0)
            System.out.println("You put nothing");
        else
        {
            System.out.print("Count of this numbers is " + count);
            System.out.println("Average of this numbers is " + (double)sum/count);
        }
    }

    public void Solution10()
    {
        char c = 'a';

        do
        {
            System.out.print(c);
            c = (char)(c + 1);
        } while (c <= 'z');
    }

    public void Solution11()
    {
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                System.out.print(i + "*" + j + "=" + i * j);
                System.out.print("\t");
            }

            System.out.println();
        }
    }

    public void Solution12()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five integers : ");
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            int n = sc.nextInt();
            if (n > 0)
                sum += n;
        }

        System.out.println("The addition of two numbers is " + sum);

        sc.close();
    }

    public void Solution13()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program will be terminated if you enter \"exit\"");
        while (true)
        {
            System.out.print(">>");
            String text = sc.nextLine();
            if (text.equals("exit"))
                break;
        }

        System.out.println("Terminating...");

        sc.close();
    }
}
