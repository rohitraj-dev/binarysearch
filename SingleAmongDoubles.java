import java.util.*;
class SingleAmongDoubles
{
    public static int findOnce(int arr[])
    {
        int length = arr.length;
        if(length == 0)
            return arr[0];
        if(arr[0] != arr[1])
            return arr[0];
        if(arr[length - 1] != arr[length - 2])
            return arr[length - 1];

        int lo = 0;
        int hi = length - 1;
        //int mid = 0;

        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;
            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid+1])
                return arr[mid];
            int f = mid;
            int s = mid;
            if(arr[mid-1] == arr[mid])
                f = mid - 1;
            else 
                s = mid + 1;
            int leftCount = f - lo;
            int rightCount = hi - s;
            if(leftCount % 2 == 0)
                lo = s + 1;
            else
                hi = f - 1;
        }
        return 942;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        //int arr[] = {1};
        
        System.out.println(findOnce(arr));
    }
}