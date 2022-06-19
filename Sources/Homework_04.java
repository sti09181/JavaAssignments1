////////////////////////////
///// Homework_04.java /////
////////////////////////////

public class Homework_04
{
    public int[] Solution01(int[] arr)
    {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            answer[i] = arr[arr.length - 1 - i];

        return answer;
    }

    public int[] Solution02(int n)
    {
        int[] answer = new int[9];

        for (int i = 1; i <= 9; i++)
            answer[i - 1] = n * i;

        return answer;
    }

    public int[] Solution03(int n)
    {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++)
            answer[i] = n - i;

        return answer;
    }

    public int Solution04(int[] arr)
    {
        int max = 0;
        int answer = 0;

        int[] count = new int[10];

        for (int j : arr)
            count[j]++;

        for (int i = 0; i < count.length; i++)
        {
            if (max < count[i] || (max == count[i] && answer < i))
            {
                answer = i;
                max = count[i];
            }
        }

        return answer;
    }

    public int Solution05(int[][] arr)
    {
        int max = 0;
        int answer = 0;

        int[] calculated = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            calculated[i] = arr[i][0] * arr[i][1];

        for (int i = 0; i < calculated.length; i++)
            if (max < calculated[i])
            {
                answer = i;
                max = calculated[i];
            }

        return answer;
    }

    public int[] Solution06(int[] scores)
    {
        int[] answer = new int[scores.length + 1];

        for (int i = 0; i < scores.length; i++)
            if (scores[i] < 50)
            {
                answer[scores.length]++;
                answer[i] = scores[i] + 20;
            }
            else
                answer[i] = scores[i];

        return answer;
    }

    public int[] Solution07(int[] nums)
    {
        int[] answer = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++)
            for (int j = i; j < nums.length; j++)
                if (i % 2 == 1)
                {
                    if (nums[i] > nums[j])
                        answer[i]++;
                }
                else
                {
                    if (nums[i] < nums[j])
                        answer[i]++;
                }

        return answer;
    }

    public int Solution08(int[] books)
    {
        int temp = 10;
        int answer = 0;

        for (int book : books)
        {
            if (temp > book)
                temp -= book;
            else if (temp < book)
            {
                answer += temp;
                temp = 10 - book;
            }
            else
                temp = 10;
        }

        answer += temp;
        return answer;
    }

    public int Solution09(int[] T, int W)
    {
        int answer = W;
        int nowbuy = 0;

        for (int i = 0; i < T.length - 1; i++)
        {
            if (nowbuy == 0 && T[i + 1] > T[i])
            {
                nowbuy = answer / T[i];
                answer -= T[i] * nowbuy;
            }
            else if (T[i + 1] < T[i])
            {
                answer += T[i] * nowbuy;
                nowbuy = 0;
            }
        }

        answer += T[T.length - 1] * nowbuy;
        return answer;
    }

    public int Solution10(int[] nums)
    {
        for (int i = nums.length - 1; i > 0; i--)
        {
            int[] nextnums = new int[i];
            for (int j = 0; j < i; j++)
                nextnums[j] = (nums[j] + nums[j + 1]) % 100000007;
            nums = nextnums;
        }

        return nums[0]; 
    }
}
