import java.util.*;
class SquareRoot
{
    public static int floorSqrt(int num)
    {
        int lo = 1;
        int hi = num;
        int flag = 0;
        while(lo<=hi)
        {
            int mid = (lo + hi) / 2;
            if( mid * mid == num)
                return mid;
            else if(mid * mid > num)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return hi;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int num = sc.nextInt();

        System.out.println(floorSqrt(num));


        // System.out.print("enter the number : ");
        // double num = sc.nextDouble();

        // int sqRoot = (int)Math.pow(num, 1/2);

        // System.out.println(sqRoot);

        // int number = sc.nextInt();
        // int root = 0;
        // for(int i=1; i<=number; i++)
        // {
        //     if(i * i > number)
        //         break;
        //     root = i;
        // }
        // System.out.println(root);

    }
}