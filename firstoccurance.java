import java.util.*;
class firstoccurance
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int target = 5;

        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        int flag = 0;
        int idx = -1;

        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            if(arr[mid] > target)
                hi = mid - 1;
            else if(arr[mid] < target)
                lo = mid + 1;
            else if(arr[mid] == target)
            {
                //flag = 1;
                idx = mid;
                hi = mid - 1;
            }
        }
        System.out.println("found first at : "+idx);
        
    }
}