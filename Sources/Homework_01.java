////////////////////////////
///// Homework_01.java /////
////////////////////////////

public class Homework_01
{
    public int Solution01(int x, int y, int z)
    {
        if ((x * x) < (y * y) + (z * z))
            return 1;
        else if ((x * x) > (y * y) + (z * z))
            return 3;
        else
            return 2;
    }

    public int Solution02(int width, int height)
    {
        return width * height / 2;
    }

    public int Solution03(int num1, int num2)
    {
        return (num1 + num2) + (num1 - num2) + (num1 * num2);
    }

    public int Solution04(int money, int chicken)
    {
        return money / chicken;
    }

    public String Solution05(int face, int side, int apex)
    {
        if (face == 4 && side == 6 && apex == 4)
            return "정사면체";
        else if (face == 6 && side == 12 && apex == 8)
            return "정육면체";
        else if (face == 8 && side == 12 && apex == 6)
            return "정팔면체";
        else if (face == 12 && side == 30 && apex == 20)
            return "정십이면체";
        else if (face == 20 && side == 30 && apex == 12)
            return "정이십면체";
        else
            return "False";
    }

    public int Solution06(int h, int m)
    {
        return (((h * 60) + m) / 100) + 1;
    }

    public String Solution08(int theta)
    {
        String answer;

        theta %= 360;

        if (theta > 0 && theta < 90)
            answer = "제1사분면";
        else if (theta > 90 && theta < 180)
            answer = "제2사분면";
        else if (theta > 180 && theta < 270)
            answer = "제3사분면";
        else if (theta > 270)
            answer = "제4사분면";
        else
            answer = "좌표축";

        return answer;
    }

    public int Solution10(int width, int height)
    {
        return width * height;
    }
}
