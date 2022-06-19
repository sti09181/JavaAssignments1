////////////////////////////
///// Homework_09.java /////
////////////////////////////

import java.math.BigInteger;

public class Homework_09
{
    public double Solution01(int[] numbers, int target)
    {
        int count = 0;
        double answer = (double)1 / (double)numbers.length;

        for (int number : numbers)
            if (number == target)
                count++;

        return answer * count;
    }

    public int[] Solution02(int[] set, int[][] subSets)
    {
        int count = 0;

        for (int[] subSet : subSets)
            for (int elementsOfSubset : subSet)
            {
                for (int elementsOfSet : set)
                    if (elementsOfSubset != elementsOfSet)
                        count++;

                if (count == set.length)
                    return subSet;
                else
                    count = 0;
            }

        return null;
    }

    public int Solution03(int[][] input, int capacity)
    {
        int answer = input.length;

        for (int scanY = 0; scanY < input.length; scanY++)
        {
            boolean triggered = false;

            for (int scanX = 0; scanX < input[scanY].length; scanX++)
            {
                int count = 0;

                for (int recursiveScanY = scanY; recursiveScanY >= 0; recursiveScanY--)
                    for (int recursiveScanX = input[recursiveScanY].length - 1; recursiveScanX >= 0; recursiveScanX--)
                    {
                        if (triggered)
                            break;

                        if (input[scanY][scanX] == input[recursiveScanY][recursiveScanX])
                            count++;

                        if (count > capacity)
                        {
                            triggered = true;
                            answer--;
                        }
                    }
            }
        }

        return answer;
    }

    public int[][] Solution05(int[][] A, int[][] B)
    {
        int[][] answer = { { -1 } };

        if (A[0].length != B.length)
            return answer;

        answer = new int[A.length][B[0].length];

        for (int i = 0; i < answer.length; i++)
            for (int j = 0; j < answer[i].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    answer[i][j] += A[i][k] * B[k][j];

        return answer;
    }

    // Class for Solution06
    static class Menu
    {
        protected int price;

        Menu()
        {
            this.price = 0;
        }

        Menu(int price)
        {
            this.price = price;
        }

        int getPrice()
        {
            return this.price;
        }

        void setPrice(int price)
        {
            this.price = price;
        }
    }

    // Class for Solution06
    static class Food extends Menu
    {
        private int cookingTime;

        Food()
        {
            this.price = 0;
            this.cookingTime = 0;
        }

        Food(int price, int cookingTime)
        {
            this.price = price;
            this.cookingTime = cookingTime;
        }

        int getCookingTime()
        {
            return this.cookingTime;
        }

        void setCookingTime(int cookingTime)
        {
            this.cookingTime = cookingTime;
        }
    }

    // Class for Solution06
    static class Juice extends Menu
    {
        private String flavor;

        Juice()
        {
            this.price = 0;
            this.flavor = "오렌지";
        }

        Juice(int price, String flavor)
        {
            this.price = price;
            this.flavor = flavor;
        }

        String getFlavor()
        {
            return this.flavor;
        }

        void setFlavor(String flavor)
        {
            this.flavor = flavor;
        }
    }

    // Class for Solution06
    static class Order
    {
        private final Menu[] orderList;

        Order()
        {
            this.orderList = new Menu[0];
        }

        Order(Menu[] orderList)
        {
            this.orderList = new Menu[orderList.length];
            System.arraycopy(orderList, 0, this.orderList, 0, orderList.length);
        }

        public int bill()
        {
            int answer = 0;
            for (Menu order : orderList)
                answer += order.getPrice();
            return answer;
        }

        public int waitingTime()
        {
            int answer = 0;

            for (Menu order : orderList)
                if (order instanceof Food)
                    answer += ((Food)order).getCookingTime();

            return answer;
        }
    }

    // Class for Solution07
    static class Book
    {
        protected String title;
        protected String author;

        Book()
        {
            this.title = "unknown";
            this.author = "unknown";
        }

        Book(String title, String author)
        {
            this.title = title;
            this.author = author;
        }

        public String getTitle()
        {
            return title;
        }

        public String getAuthor()
        {
            return author;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }

        public void setAuthor(String author)
        {
            this.author = author;
        }
    }

    // Class for Solution07
    static class BookstoreBook extends Book
    {
        private int price;

        BookstoreBook()
        {
            this.title = "unknown";
            this.author = "unknown";
            this.price = 0;
        }

        BookstoreBook(String title, String author, int price)
        {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public int getPrice()
        {
            return price;
        }

        public void setPrice(int price)
        {
            this.price = price;
        }
    }

    // Class for Solution07
    static class LibraryBook extends Book
    {
        private boolean checkedOut;

        LibraryBook()
        {
            this.title = "unknown";
            this.author = "unknown";
            this.checkedOut = false;
        }

        LibraryBook(String title, String author, boolean checkedOut)
        {
            this.title = title;
            this.author = author;
            this.checkedOut = checkedOut;
        }

        public boolean getCheckedOut()
        {
            return checkedOut;
        }

        public void setCheckedOut(boolean checkedOut)
        {
            this.checkedOut = checkedOut;
        }

        public void returnBook()
        {
            this.checkedOut = false;
        }

        public boolean checkOut()
        {
            if (!checkedOut)
            {
                this.checkedOut = true;
                return true;
            }

            return false;
        }
    }

    public String Solution08(String x1, String x2)
    {
        BigInteger destination = new BigInteger(x1);
        BigInteger source = new BigInteger(x2);

        destination = destination.add(source);

        return destination.toString();
    }

    public int Solution09(String cards)
    {
        int countO = 0;
        int countX = 0;

        for (int i = 0; i < cards.length(); i++)
            if (cards.charAt(i) == 'o')
            {
                countO++;
                for (int j = i; j < cards.length(); j++)
                    if (cards.charAt(j) != 'o')
                    {
                        i = j - 1;
                        break;
                    }
            }
            else if (cards.charAt(i) == 'x')
            {
                countX++;
                for (int j = i; j < cards.length(); j++)
                    if (cards.charAt(j) != 'x')
                    {
                        i = j - 1;
                        break;
                    }
            }

        return Math.min(countO, countX);
    }

    public int Solution10(int[] array_1, int[] array_2)
    {
        int count = 0;

        for (int first : array_1)
            for (int second : array_2)
                if (first == second)
                    count++;

        return switch (count)
        {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            default -> 0;
        };
    }
}
