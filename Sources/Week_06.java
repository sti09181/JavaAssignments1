////////////////////////
///// Week_06.java /////
////////////////////////

public class Week_06
{
    /////////////////////////
    ///// April 7, 2021 /////
    /////////////////////////

    public void Solution01()
    {
        String name = "Object-Oriented Programming";
        String sbj1 = new String("Object-Oriented Programming");
        String sbj2 = "Open-Source Software";
        System.out.println("sbj1 : " + sbj1);
        System.out.println("sbj2 : " + sbj2);
        System.out.println("name.equals(sbj1) : " + name.equals(sbj1));
        System.out.println("name.equals(sbj2) : " + name.equals(sbj2));
        System.out.println("name == sbj1 : " + (name == sbj1));

        String class1 = "Java Programming";
        String class2 = "Java Programming";
        String class3 = new String("Java Programming");
        System.out.println("class1 : " + class1);
        System.out.println("class2 : " + class2);
        System.out.println("class3 : " + class3);
        System.out.println("class1 == class2 : " + (class1 == class2));
        System.out.println("class1 == class3 : " + (class1 == class3));
        System.out.println("class1.equals(class3) : " + class1.equals(class3));
    }

    public void Solution02()
    {
        double score[][] =
        {
            { 3.3, 3.4 },
            { 3.5, 3.6 },
            { 3.7, 4.0 },
            { 4.1, 4.2 }
        };

        double sum = 0;

        for (int year = 0; year < score.length; year++)
            for (int term = 0; term < score[year].length; term++)
                sum += score[year][term];
        
        System.out.println("Average of this scores : " + sum / (score.length * score[0].length));
    }

    /////////////////////////
    ///// April 9, 2021 /////
    /////////////////////////

    public void Solution03()
    {
        int arrayOfIntegers[][] = new int[4][];
        arrayOfIntegers[0] = new int[3];
        arrayOfIntegers[1] = new int[2];
        arrayOfIntegers[2] = new int[3];
        arrayOfIntegers[3] = new int[2];

        for (int i = 0; i < arrayOfIntegers.length; i++)
        {
            for (int j = 0; j < arrayOfIntegers[i].length; j++)
                System.out.print(arrayOfIntegers[i][j] + " ");
            System.out.println();
        }
    }

    private int[] DepenedentToSolution04()
    {
        int arrayOfIntegers[] = new int[4];

        for (int i = 0; i < arrayOfIntegers.length; i++)
            arrayOfIntegers[i] = i + 1;

        return arrayOfIntegers;
    }

    public void Solution04()
    {
        int arrayOfIntegers[] = DepenedentToSolution04();

        for (int i = 0; i < arrayOfIntegers.length; i++)
            System.out.print(arrayOfIntegers[i] + " ");
    }
}
