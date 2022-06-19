////////////////////////
///// Week_05.java /////
////////////////////////

import java.util.Scanner;

public class Week_05
{
    //////////////////////////
    ///// March 31, 2021 /////
    //////////////////////////

    public void Solution01()
    {
        int max = 0;
        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + numbers.length + " Integers : ");

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
            if (numbers[i] > max)
                max = numbers[i];
        }

        sc.close();

        System.out.println("Maximum value : " + max);
    }

    public void Solution02()
    {
        int sum = 0;
        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + numbers.length + " Integers : ");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = sc.nextInt();

        for (int i : numbers)
            sum += i;

        sc.close();

        System.out.println("Average Value of Elements of Array : " + (double)sum / (double)numbers.length);
    }

    public void Solution03()
    {
        int sum = 0;
        int[] numbers = { 1, 2, 3, 4, 5 };

        String[] names = { "Apple", "Pear", "Banana", "Cherry", "Strawberry", "Grape" };

        System.out.println("All Elements of Array of Integer : ");

        for (int i = 0; i < numbers.length; sum += numbers[i], i++)
            System.out.print(numbers[i] + " ");
        System.out.println();

        System.out.println("\n\nAddition Result of All Numbers of Array of Integer : " + sum);

        System.out.println("\nAll Elements of Array of String : ");

        for (String i : names)
            System.out.print(i + " ");
        System.out.println();
    }

    /////////////////////////
    ///// April 2, 2021 /////
    /////////////////////////

    public void Solution04()
    {
        String[] arrayOfString = new String[2];
        arrayOfString[0] = " C#";
        arrayOfString[1] = ",C++ ";
        
        System.out.println("Length of arrayOfString[0] : " + arrayOfString[0].length());
        System.out.println("Does arrayOfString[0] have \"#\" Character? : " + arrayOfString[0].contains("#"));

        arrayOfString[0] = arrayOfString[0].concat(arrayOfString[1]);
        System.out.println("Connect arrayOfString[0] and arrayOfString[1] : \"" + arrayOfString[0] + "\"");

        arrayOfString[0] = arrayOfString[0].trim();
        System.out.println("Remove Spaces in arrayOfString[0] : \"" + arrayOfString[0] + "\"");

        arrayOfString[0] = arrayOfString[0].replace("C#", "Java");
        System.out.println("Replace \"C#\" into \"Java\" : \"" + arrayOfString[0] + "\"");

        String[] splitted = arrayOfString[0].split(",");

        for (String i : splitted)
            System.out.println("arrayOfString[0] is Splitted! : " + i);
        
        arrayOfString[0] = arrayOfString[0].substring(5);
        System.out.println("Assign String from Index 5 and Print It Out : \"" + arrayOfString[0] + "\"");

        char extract = arrayOfString[0].charAt(2);
        System.out.println("Print Character from Index 2: \"" + extract + "\"");
    }
}
