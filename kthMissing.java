import java.util.*;
class kthMissing
{
    public static int Missing(int arr[], int k)
    {
        int lo =0;
        int hi = arr.length - 1;
        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;
            if(missing >= k)
                hi = mid - 1;
            else 
                lo = mid + 1;
        }
        return hi + 1 + k;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 5, 7, 8};
        
        System.out.print("enter k : ");
        int k = sc.nextInt();

        System.out.println("ans : " + Missing(arr, k));

    }
}