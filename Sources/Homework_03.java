////////////////////////////
///// Homework_03.java /////
////////////////////////////

import java.lang.Math;

public class Homework_03
{
    public int Solution01(int binary)
    {
        int answer = 0;

        int target;
        int multiplier = 1;

        while (binary != 0)
        {
            target = binary % 10;
            binary /= 10;

            answer += target * multiplier;
            multiplier *= 2;
        }

        return answer;
    }

    public int Solution02(int n)
    {
        return n * (n + 1) / 2;
    }

    public int Solution03(int n)
    {
        int answer = 0;
        
        for (int i = 0; i < n; i++)
            if (i % 3 == 0 || i % 5 == 0)
                answer += i;
        
        return answer;
    }

    public int[] Solution04(int[] arr, int n)
    {
        for (int i = 0; i < arr.length; i++)
            arr[i] *= n;
        
        return arr;
    }

    public int Solution05(int n, int[] arr)
    {
        int answer = 0;

        int[] count = new int[n];

        for (int i : arr)
            count[i - 1]++;
        
        for (int i = 0; i < n; i++)
            if (count[i] == 1)
            {
                answer = i + 1;
                break;
            }

        return answer;
    }

    public int Solution06(int[] arr)
    {
        int answer = 1;

        for (int i : arr)
            answer *= i;

        return answer;
    }

    public boolean Solution07(double[] vitamins)
    {
        double limit = 0;

        for (double vitamin : vitamins)
            limit += vitamin;

        return limit >= 200 && limit <= 500;
    }

    public int Solution08(int n)
    {
        int answer = 0;

        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i <= n; i++)
        {
            if (!arr[i])
            {
                answer++;
                for (int j = i; j <= n; j += i)
                    arr[j] = true;
            }
        }

        return answer;
    }

    public int Solution09(int[] grade, int supported, int notSupported, int costOfNotSupported)
    {
        int answer = 0;

        for (int i : grade)
        {
            int compare = supported;
            while (i > compare)
            {
                answer += costOfNotSupported;
                compare += notSupported;
            }
        }

        return answer;
    }

    public int Solution10(int n)
    {
        int index;
        int answer = 0;

        int[] count = new int[10];

        do
        {
            index = n % 10;
            n /= 10;
            count[index]++;
        } while (n != 0);

        for (int i : count)
            answer = Math.max(answer, i);

        return answer;
    }
}
