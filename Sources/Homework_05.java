////////////////////////////
///// Homework_05.java /////
////////////////////////////

import java.util.Arrays;

public class Homework_05
{
    public int Solution01(int[] arr)
    {
        int answer = 0;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] >= 100)
            {
                answer = i;
                break;
            }

        return answer;
    }

    public int[] Solution02(int h, int m, int time)
    {
        int[] answer = { (time / 60) + h, (time % 60) + m };
        
        while (answer[1] / 60 != 0)
        {
            answer[0]++;
            answer[0] -= 60;
        }
        
        while (answer[0] / 24 != 0)
            answer[0] -= 24;

        return answer;
    }

    public int[] Solution03(int[][] param0)
    {
        int[] answer = new int[param0.length];

        for (int i = 0; i < param0.length; i++)
            for (int j = 0; j < param0[i].length; j++)
                answer[i] += param0[i][j];

        return answer;
    }

    public String Solution04(String str, String target, String replace)
    {
        return str.replace(target, replace);
    }

    public String Solution05(boolean flag, String str)
    {
        if (flag)
            str = str.toUpperCase();
        else
            str = str.toLowerCase();

        return str;
    }

    public int Solution06(String str)
    {
        int count = 1;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ')
                count++;

        return count;
    }

    public char Solution07(String str1, String str2)
    {
        char answer = ' ';

        for (int i = 0; i < str1.length(); i++)
            if (str1.charAt(i) != str2.charAt(i))
            {
                answer = str1.charAt(i);
                break;
            }

        return answer;
    }
    
    public int Solution08(int[][] Phones)
    {
        int answer = 0;

        for (int[] phone : Phones)
        {
            final int condition = (int) Math.sqrt(Math.pow(phone[0], 2) + Math.pow(phone[1], 2));
            if (condition < 100)
                answer++;
        }

        return answer;
    }

    public int[] Solution09(int n, int[] foods)
    {
        int[] answer = { n, 0 };

        Arrays.sort(foods);

        for (int food : foods)
        {
            if (answer[0] - food < 0)
                break;

            answer[0] -= food;
            answer[1]++;
        }

        return answer;
    }

    // Method for Solution10()
    private int GetAnswer(int[][] students, int answer, int i, int j, int k)
    {
        if (k == i)
        {
            if (j == 0)
                for (int l = j; l <= j + 1; l++)
                    answer = Math.max(answer, students[k][l]);
            else if (j == students[i].length - 1)
                for (int l = j - 1; l <= j; l++)
                    answer = Math.max(answer, students[k][l]);
            else
                for (int l = j - 1; l <= j + 1; l++)
                    answer = Math.max(answer, students[k][l]);
        }
        else
            answer = Math.max(answer, students[k][j]);

        return answer;
    }

    public int Solution10(int[][] students)
    {
        int answer = 0;

        for (int i = 0; i <= students.length - 1; i++)
            for (int j = 0; j <= students[i].length - 1; j++)
                if (students[i][j] == -1)
                {
                    if (i == 0)
                        for (int k = i; k <= i + 1; k++)
                            answer = GetAnswer(students, answer, i, j, k);
                    else if (i == students.length - 1)
                        for (int k = i - 1; k <= i; k++)
                            answer = GetAnswer(students, answer, i, j, k);
                    else
                        for (int k = i - 1; k <= i + 1; k++)
                            answer = GetAnswer(students, answer, i, j, k);
                }

        return answer;
    }
}
