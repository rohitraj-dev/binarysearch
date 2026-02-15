import java.util.*;
class descSortedArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {100, 91, 87, 76, 66, 52, 43, 35, 29, 13, 5};
        int target = 43;

        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        //int idx = -1;
        int flag = 0;

        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            if(arr[mid] > target)
                lo = mid + 1;
            else if(arr[mid] < target)
                hi = mid - 1;
            else if(arr[mid] == target)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.print("found at index : "+mid);
        }
        else
        {
            System.out.print("not found");
        }
        
    }
}
