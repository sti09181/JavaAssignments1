////////////////////////////
///// Homework_10.java /////
////////////////////////////

public class Homework_10
{
    // Class for Solution01
    static class Animal
    {
        protected String name;
        protected String type;
        protected int age;

        Animal()
        {
            this.name = "unknown";
            this.type = "unknown";
            this.age = 0;
        }

        Animal(String name, String type, int age)
        {
            this.name = name;
            this.type = type;
            this.age = age;
        }

        @Override
        public String toString()
        {
            return "저는 " + this.type + "입니다. 제 이름은 " + this.name + "입니다. 제 나이는 " + this.age + "살 입니다.";
        }
    }

    // Class for Solution02
    static class Student
    {
        protected String name;
        protected String major;
        protected int age;
        protected double grade;

        Student(String name, String major, int age, double grade)
        {
            this.name = name;
            this.major = major;
            this.age = age;
            this.grade = grade;
        }

        @Override
        public String toString()
        {
            return this.major + "과에 다니는 " + this.age + "살 " + this.name + "입니다.";
        }

        public String getName()
        {
            return this.name;
        }

        public String getMajor()
        {
            return this.major;
        }

        public int getAge()
        {
            return this.age;
        }

        public double getGrade()
        {
            return this.grade;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setMajor(String major)
        {
            this.major = major;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public void setGrade(double grade)
        {
            this.grade = grade;
        }
    }

    // Class for Solution03
    static class Hero
    {
        protected String name;
        protected String job;
        protected String skill;
        protected int level;

        Hero(String name, String job)
        {
            this.name = name;
            this.job = job;
            this.skill = "기본공격";
            this.level = 1;
        }

        public String getName()
        {
            return this.name;
        }

        public String getJob()
        {
            return this.job;
        }

        public String getSkill()
        {
            return this.skill;
        }

        public int getLevel()
        {
            return this.level;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setJob(String job)
        {
            this.job = job;
        }

        public void setSkill(String skill)
        {
            this.skill = skill;
        }

        public void setLevel(int level)
        {
            this.level = level;
        }

        public String attack()
        {
            return this.skill;
        }

        public void levelUp()
        {
            this.level++;
        }

        @Override
        public String toString()
        {
            return "나 " + this.name + "은 " + this.job + "이다.";
        }
    }

    // Class for Solution04
    static class Point
    {
        private int x;
        private int y;

        Point()
        {
            this.x = 0;
            this.y = 0;
        }

        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public int getX()
        {
            return this.x;
        }

        public int getY()
        {
            return this.y;
        }

        public void setX(int x)
        {
            this.x = x;
        }

        public void setY(int y)
        {
            this.y = y;
        }

        @Override
        public String toString()
        {
            return "(" + this.x + "," + this.y + ")";
        }
    }

    public String Solution05(int[] rhythm)
    {
        int ascending = 1;
        int descending = 8;
        boolean isAscending = false;
        boolean isDescending = false;

        for (int elementsOfRhythm : rhythm)
        {
            if (rhythm[0] == 1)
            {
                isAscending = true;

                if (elementsOfRhythm != ascending)
                    return "mixed";

                ascending++;
            }
            else if (rhythm[0] == 8)
            {
                isDescending = true;

                if (elementsOfRhythm != descending)
                    return "mixed";

                descending--;
            }
            else
                return "mixed";
        }

        if (isAscending)
            return "ascending";
        else if (isDescending)
            return "descending";

        return null;
    }

    public int Solution06(int param0)
    {
        int answer = 1;

        if (param0 < 0)
            return -1;

        for (int i = param0; i >= 1; i--)
            answer *= i;

        return answer;
    }

    public int Solution07(int[] supports)
    {
        int answer = 0;

        for (int elementsOfSupports : supports)
        {
            answer += elementsOfSupports;

            if (answer >= 100)
                return answer;
        }

        return 100 - answer;
    }

    public boolean Solution08(int[] input, int target)
    {
        for (int i = 0; i < input.length - 1; i++)
            for (int j = i + 1; j < input.length; j++)
            {
                if (input[i] + input[j] == target)
                    return true;
            }

        return false;
    }

    public int[] Solution09(int[] array)
    {
        int[] answer = new int[array.length];

        for (int i = 0, j = array.length - 1; i < answer.length && j >= 0; i++, j--)
            answer[i] = array[j];

        return answer;
    }

    public int Solution10(int[][] transfer, int[] A)
    {
        int countOfLeavesInA = 0;
        int countOfSheepInA = 0;
        int countOfWolvesInA = 0;

        int countOfLeavesInB = 0;
        int countOfSheepInB = 0;
        int countOfWolvesInB = 0;

        for (int elementsOfA : A)
            switch (elementsOfA)
            {
                case 1 -> countOfLeavesInA++;
                case 2 -> countOfSheepInA++;
                case 3 -> countOfWolvesInA++;
            }

        for (int i = 0; i < transfer.length; i++)
            for (int j = 0; j < transfer[i].length; j++)
                switch (transfer[i][j])
                {
                    case 1 -> transfer[i][j] = 10;
                    case 2 -> transfer[i][j] = 20;
                    case 3 -> transfer[i][j] = 30;
                }

        for (int i = 0; i < transfer.length; i++)
        {
            int weight = 0;

            for (int j = 0; j < transfer[i].length; j++)
            {
                weight += transfer[i][j];

                if (i % 2 == 0)
                    switch (transfer[i][j])
                    {
                        case 10 -> { countOfLeavesInA--; countOfLeavesInB++; }
                        case 20 -> { countOfSheepInA--; countOfSheepInB++; }
                        case 30 -> { countOfWolvesInA--; countOfWolvesInB++; }
                    }
                else
                    switch (transfer[i][j])
                    {
                        case 10 -> { countOfLeavesInB--; countOfLeavesInA++; }
                        case 20 -> { countOfSheepInB--; countOfSheepInA++; }
                        case 30 -> { countOfWolvesInB--; countOfWolvesInA++; }
                    }
            }

            if (weight > 100)
                return i + 1;

            if ((i % 2 == 0) && ((countOfWolvesInA > countOfSheepInA && countOfSheepInA > 0) || (countOfSheepInA > countOfLeavesInA && countOfLeavesInA > 0)))
                return i + 1;

            if ((i % 2 == 1) && ((countOfWolvesInB > countOfSheepInB && countOfSheepInB > 0) || (countOfSheepInB > countOfLeavesInB && countOfLeavesInB > 0)))
                return i + 1;
        }

        if (!(countOfLeavesInA == 0 && countOfSheepInA == 0 && countOfWolvesInA == 0))
            return 0;

        return -1;
    }
}
