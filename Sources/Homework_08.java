////////////////////////////
///// Homework_08.java /////
////////////////////////////

public class Homework_08
{
    public int Solution01(int input, int[] primes)
    {
        int answer = 1;
        int[] power = new int[primes.length];

        do
        {
            for (int i = 0; i < power.length; i++)
            {
                if (input % primes[i] == 0)
                {
                    input /= primes[i];
                    power[i] += 1;
                }
            }
        } while (input != 1);

        for (int i : power)
            answer *= i + 1;

        return answer;
    }

    public int Solution02(String[] students)
    {
        int[] location = { 0, 0 };

        for (int i = 0; i < students.length; i++)
        {
            if (students[i].equals("윤정"))
                location[0] = i;
            else if (students[i].equals("지영"))
                location[1] = i;
        }

        return Math.abs(location[0] - location[1]) - 1;
    }

    public String Solution03(String[] names)
    {
        String answer = "";

        for (String name : names)
            if (answer.length() < name.length())
                answer = name;

        return answer;
    }

    public int Solution04(int money)
    {
        int answer = 0;

        int[] breakfast = { 2000, 2500 };
        int[] lunch = { 4500, 5000, 6000 };
        int[] dinner = { 15000, 18000, 20000 };

        for (int i : breakfast)
            for (int j : lunch)
                for (int k : dinner)
                {
                    int compare = i + j + k;
                    if (money - compare >= 0)
                        answer++;
                }

        return answer;
    }

    public int[] Solution05(int[] coordinate, String command)
    {
        for (int i = 0; i < command.length(); i++)
        {
            switch (command.charAt(i))
            {
                case 'U' -> coordinate[0]++;
                case 'D' -> coordinate[0]--;
                case 'L' -> coordinate[1]--;
                case 'R' -> coordinate[1]++;
            }
        }

        return coordinate;
    }

    public String Solution06(String A, String B)
    {
        int countError = 0;
        int acceptableError = A.length() / 10;

        if (acceptableError == 0)
            acceptableError++;

        for (int i = 0; i < A.length(); i++)
        {
            if (A.charAt(i) != B.charAt(i))
                countError++;
        }

        if (acceptableError - countError >= 0)
            return "True";

        return "False";
    }

    public int Solution07(int h, int m, int a)
    {
        int count = 0;
        int normalClock = ((h * 60) + m);
        int brokenClock = ((h * 60) + m);

        while (true)
        {
            if (normalClock >= 780)
                normalClock = 60 + (normalClock - 780);
            else if (brokenClock >= 780)
                brokenClock = 60 + (brokenClock - 780);

            if (count != 0 && normalClock == brokenClock)
                break;

            brokenClock += a;
            normalClock++;
            count++;

            if (normalClock == brokenClock)
                break;
        }

        int hour = normalClock / 60;
        int minute = normalClock % 60;

        return count + hour + minute;
    }

    public int Solution08(int col, int row, int n, int[][] virus)
    {
        int answer = 0;

        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { 1, 0, -1, 1, -1, 1, 0, -1 };

        boolean[][] map = new boolean[row][col];
        boolean[][] temp = new boolean[row][col];

        for (int[] i : virus)
            map[i[1]][i[0]] = true;

        for (int timeTaken = 0; timeTaken < n; timeTaken++)
        {
            for (int i = 0; i < row; i++)
                System.arraycopy(map[i], 0, temp[i], 0, col);

            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++)
                    if (temp[i][j])
                        for (int k = 0; k < 8; k++)
                        {
                            int x = j + dx[k];
                            int y = i + dy[k];

                            if (x < 0 || x >= col || y < 0 || y >= row)
                                continue;

                            map[y][x] = true;
                        }
        }

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                if (map[i][j])
                    answer++;

        return answer;
    }

    // Class for Solution09
    static class Customer
    {
        public String name;
        public int age;
        public static int numOfCustomers = 0;

        Customer()
        {
            name = "unknown";
            age = 1;
            numOfCustomers++;
        }

        Customer(String name, int age)
        {
            this.name = name;
            this.age = age;
            numOfCustomers++;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public static int getNumOfCustomers()
        {
            return numOfCustomers;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
    }

    // Class for Solution10
    static class Employee
    {
        private String name;
        private int salary;
        private static int numOfEmployee;

        Employee()
        {
            name = "";
            salary = 0;
            numOfEmployee++;
        }

        Employee(String name, int salary)
        {
            this.name = name;
            this.salary = salary;
            numOfEmployee++;
        }

        public String getName()
        {
            return name;
        }

        public int getSalary()
        {
            return salary;
        }

        public static int getNumOfEmployee()
        {
            return numOfEmployee;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setSalary(int salary)
        {
            this.salary = salary;
        }
    }
}
