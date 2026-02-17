import java.util.*;
class findPeak
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //int arr[] = {-1, 0, 1, 2, 5, 6, 7, 8, 3, 2, 1, 0, -1};
        int arr[] = {1, 2, 3, 2, 1};

        int lo = 0;
        int hi = arr.length - 1;
        int mid  = 0;
        int flag = 0;

        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
            {
                flag = 1;
                break;
            }
            else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
                lo = mid + 1;
            else if(arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1])
                hi = mid - 1;
        }
        if(flag == 1)
        {
            System.out.println("peak found at index : " +mid);
        }
        else
        {
            System.out.println("peak not found");
        }
    }
}