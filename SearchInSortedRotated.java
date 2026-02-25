import java.util.*;
class SearchInSortedRotated
{
    public static int Search(int arr[], int target)
    {
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[lo] <= arr[mid])
            {
                if(arr[lo]<= target && target<arr[mid])
                    hi = mid -1;
                else
                    lo = mid + 1;
            }
            else
            {
                if(arr[mid]<target && target<=arr[hi]) 
                    lo = mid + 1;
                else
                    hi = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {4, 5, 6, 7, 8, 9, 10, 1, 2};
        
        System.out.print("enter the target element : ");
        int target = sc.nextInt();

        System.out.println("index of target : "+Search(arr, target));
    }
}