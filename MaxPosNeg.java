import java.util.*;
class MaxPosNeg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {-5, -4, -3, -1, 0, 0, 0, 1, 2, 6, 8, 9, 10};
        
        int length = arr.length;
        int hi = length - 1;
        int lo = 0;
        int negCount = 0;
        
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] < 0)
            {
                negCount = mid + 1;
                lo = mid + 1;
            }
            else
                hi = mid - 1;
        }
        lo = 0;
        hi = length - 1;
        int posCount = 0;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] > 0)
            {
                posCount = length - mid;
                hi = mid - 1;
            }
            else 
                lo = mid + 1;
        }

        int max = Math.max(posCount, negCount);
        System.out.println("max among positive and negative : "+max);
    }
}