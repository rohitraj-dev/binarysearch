import java.util.*;
class floor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int mid = 0;
        int hi = arr.length - 1;
        int lo = 0;
        int flag = 0;
        int target = 5;
        int idx = -1;

        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            // if(arr[mid] == target)
            // {
            //     flag = 1;
            //     break;
            // }
            if(arr[mid] > target)
                hi = mid - 1;
            // else if(arr[mid] < target && arr[mid] > arr[mid+1])
            // {
            //     flag = 1;
            //     break;
            // }
            // else if(arr[mid] < target)
            //     lo = mid + 1;
            else 
            {
                idx = mid;
                lo = mid + 1;
            }
        }
        System.out.println(idx);
        System.out.println(arr[idx]);
    }
}