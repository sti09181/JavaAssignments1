////////////////////////
///// Week_07.java /////
////////////////////////

import java.util.Scanner;

public class Week_07
{
    //////////////////////////
    ///// April 16, 2021 /////
    //////////////////////////
    
    // Class for Solution01
    private static class Circle
    {
        int radius;
        String name;

        Circle()
        {
            radius = 0;
            name = "";
        }

        Circle(int r, String n)
        {
            radius = r;
            name = n;
        }

        double getArea()
        {
            return 3.14 * radius * radius;
        }
    }

    // Class for Solution02
    private static class Rectangle
    {
        int width;
        int height;

        int getArea()
        {
            return width * height;
        }
    }

    // Class for Solution03
    private static class Book
    {
        String title;
        String author;

        Book(String t)
        {
            title = t;
            author = "Unknown";
        }

        Book(String t, String a)
        {
            title = t;
            author = a;
        }
    }

    public void Solution01()
    {
        double area = 0.0;

        Circle pizza = new Circle(10, "Java Pizza");
        area = pizza.getArea();
        System.out.println("Radius of " + pizza.name + " is " + area);

        Circle donut = new Circle(2, "Java Donut");
        area = donut.getArea();
        System.out.println("Radius of " + donut.name + " is " + area);

        Circle nothing = new Circle();
        area = nothing.getArea();
        System.out.println("Radius of " + nothing.name + " is " + area);
    }

    public void Solution02()
    {
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width and height of the rectangle : ");

        rect.width = sc.nextInt();
        rect.height = sc.nextInt();

        sc.close();

        System.out.println("The perimeter of the rectangle : " + rect.getArea());
    }

    public void Solution03()
    {
        Book littlePrince = new Book("The Little Prince", "Antoine de Saint-Exupéry");
        Book loveStory = new Book("Another Romantic Comedy LOL");
        System.out.println(littlePrince.title + ", " + littlePrince.author);
        System.out.println(loveStory.title + ", " + loveStory.author);
    }
}
