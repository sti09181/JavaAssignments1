////////////////////////////
///// Homework_07.java /////
////////////////////////////

import java.util.Arrays;

public class Homework_07
{
    public boolean Solution01(int[] input)
    {
        return input[4] - input[0] == input[5] - input[1] && input[6] - input[2] == input[7] - input[3];
    }

    public int Solution02(int input)
    {
        int temp = input;
        int power = 0;

        while (temp != 0)
        {
            power++;
            temp /= 10;
        }

        int additionDifference = (int)Math.pow(10, power) - input;
        int subtractionDifference = input - (int)Math.pow(10, power - 1);

        return Math.max(additionDifference, subtractionDifference);
    }

    public int Solution03(int[] input)
    {
        int count = 0;

        for (int i : input)
        {
            if (i == 1)
            {
                count = 0;
                continue;
            }

            count++;

            if (count == 3)
                return 0;
        }

        return 1;
    }

    public String Solution04(String[] words)
    {
        for (String word : words)
        {
            if (word.length() < 3)
                return word;
        }

        for (int i = 1; i < words.length; i++)
        {
            if (words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1))
                return words[i];
        }

        return "xxx";
    }

    public int Solution05(int[] input)
    {
        if (input[0] == input[2] && Math.abs(input[1]) == Math.abs(input[3]))
            return 0;
        else if (Math.abs(input[0]) == Math.abs(input[2]) && input[1] == input[3])
            return 1;
        else if (Math.abs(input[0]) == Math.abs(input[2]) && Math.abs(input[1]) == Math.abs(input[3]))
            return 2;
        else
            return 3;
    }

    public int Solution07(int[] candidates)
    {
        int answer = 0;
        int me = candidates[0];
        int[] others = new int[candidates.length];

        System.arraycopy(candidates, 1, others, 0, candidates.length - 1);

        Arrays.sort(others);

        while (others[others.length - 1] >= me)
        {
            others[others.length - 1]--;
            me++;
            answer++;
            Arrays.sort(others);
        }

        return answer;
    }

    public int[] Solution08(int[][] Grade)
    {
        int size = 0;
        int index = 0;

        for (int[] arraysInGrade : Grade)
            size += arraysInGrade.length;

        int[] result = new int[size];

        for (int[] arraysInGrade : Grade)
            for (int elementsOfArraysInGrade : arraysInGrade)
            {
                result[index] = elementsOfArraysInGrade;
                index++;
            }

        Arrays.sort(result);
        return result;
    }

    // Class for Solution09
    static class Birthday
    {
        public int month, day, age;
        public String name;

        private void check(int month, int day)
        {
            int[] endOfTheMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

            if (month >= 1 && month <= 12 && day >= 1 && day <= endOfTheMonth[month - 1])
            {
                this.month = month;
                this.day = day;
            }
            else
            {
                this.month = 1;
                this.day = 1;
            }
        }

        Birthday(int month, int day, int age, String name)
        {
            check(month, day);
            this.age = age;
            this.name = name;
        }

        Birthday(int month, int day, int age)
        {
            check(month, day);
            this.age = age;
            this.name = "unknown";
        }

        Birthday(int month, int day)
        {
            check(month, day);
            this.age = 1;
            this.name = "unknown";
        }

        Birthday()
        {
            this.month = 1;
            this.day = 1;
            this.age = 1;
            this.name = "unknown";
        }

        public int getMonth()
        {
            return this.month;
        }

        public int getDay()
        {
            return this.day;
        }

        public int getAge()
        {
            return this.age;
        }

        public String getName()
        {
            return this.name;
        }

        public void setMonth(int month)
        {
            this.month = month;
        }

        public void setDay(int day)
        {
            this.day = day;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }

    // Method for Solution10
    private boolean Possibility(int[][] sudoku, int row, int col, int compare)
    {
        for (int i = 0; i < 9; i++)
            if (sudoku[row][i] == compare)
                return false;

        for (int i = 0; i < 9; i++)
            if (sudoku[i][col] == compare)
                return false;

        int set_row = (row / 3) * 3;
        int set_col = (col / 3) * 3;

		for (int i = set_row; i < set_row + 3; i++)
			for (int j = set_col; j < set_col + 3; j++)
                if (sudoku[i][j] == compare)
                    return false;

        return true;
    }

    public int[][] Solution10(int[][] sudoku)
    {
        for (int i = 0; i < sudoku.length; i++)
            for (int j = 0; j < sudoku[i].length; j++)
                if (sudoku[i][j] == 0)
                    for (int k = 1; k <= 9; k++)
                        if (Possibility(sudoku, i, j, k))
                            sudoku[i][j] = k;

        return sudoku;
    }
}
