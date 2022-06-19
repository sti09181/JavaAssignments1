////////////////////////////
///// Homework_02.java /////
////////////////////////////

import java.lang.Math;

public class Homework_02
{
    public int Solution01(int n, int m, int k)
    {
        int answer = 0;

        for (int i = n; i <= m; i++)
        {
            if (i % k == 0)
                answer++;
        }

        return answer;
    }

    public String Solution02(int month, int dayOfTheMonth)
    {
        final int year = 2007;

        if (month == 1)
        {
            month = 13;
            year--;
        }

        if (month == 2)
        {
            month = 14;
            year--;
        }
        
        final int dayOfTheWeek = (int)(dayOfTheMonth + Math.floor((13.0 * ((double)month + 1.0)) / 5.0) + year + Math.floor((double)year / 4.0) - Math.floor((double)year / 100.0) + Math.floor((double)year / 400.0)) % 7;

        return switch (dayOfTheWeek)
        {
            case 0 -> "SAT";
            case 1 -> "SUN";
            case 2 -> "MON";
            case 3 -> "TUE";
            case 4 -> "WED";
            case 5 -> "THU";
            default -> "FRI";
        };
    }

    public int Solution03(int min)
    {
        int answer = 1;

        for (int i = 0; i < min; i++)
            answer *= 2;

        return answer;
    }

    public int Solution04(int n)
    {
        int answer = 0;

        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i <= n; i++)
        {
            if (!arr[i])
            {
                answer += 1;
                for (int j = i; j <= n; j += i)
                    arr[j] = true;
            }
        }

        return answer;
    }

    public int Solution05(int n)
    {
        int answer = 0;

        while (n != 0)
        {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public int Solution06(int a, int b, int c)
    {
        int answer = 2;

        while (a % answer != b % answer || b % answer != c % answer || c % answer != a % answer)
        {
            if (answer == Math.max(a, Math.max(b, c)))
                return -1;
            answer++;
        }

        return answer;
    }

    public int Solution07(int X, int Y)
    {
        int result = -1;
        final double limit = (int)((double)Y / (double)X * 100.0) * 0.01;

        while ((double)Y / (double)X > limit)
        {
            X++;
            result++;
        }

        return result;
    }

    public String[] Solution08(int a, int b, int c)
    {
        int result = b * b - 4 * a * c;

        if (b % 2 == 0)
            result = (b / 2) * (b / 2) - a * c;

        String[] answer = { String.valueOf(result), "" };

        if (result > 0)
            answer[1] = "실근 2개";
        else if (result < 0)
            answer[1] = "근이 없음";
        else
            answer[1] = "중근";

        return answer;
    }

    public int Solution09(int N, int x, int y)
    {
        int answer = 1;

        if (x % 2 == 1)
            y = (N - 1) - y;

        for (int countX = 0; countX <= x; countX++)
        {
            for (int countY = 0; countY <= (N - 1); countY++)
            {
                if (countX == x && countY == y)
                    break;
                answer++;
            }
        }

        return answer;
    }

    public int Solution10(int wetness)
    {
        int answer = 0;
        final int comparison = wetness / 10;

        if (wetness <= 10)
            return wetness;

        for (int i = 0; i <= comparison; i++)
        {
            if (wetness < 10)
            {
                answer += wetness * Math.pow(2, i);
                break;
            }
            answer += 10 * Math.pow(2,i);
            wetness -= 10;
        }

        return answer;
    }
}
