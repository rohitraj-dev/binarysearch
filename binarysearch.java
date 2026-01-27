import java.util.*;
class binarysearch
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {-76, -4, 9, 28, 47, 49, 510, 615, 9911, 99999};
        int target = 9;

        int lo = 0;
        int hi = arr.length - 1;
        int flag = 0;

        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;
            if(arr[mid] > target)
                hi = mid - 1;
            else if(arr[mid] < target)
                lo = mid + 1;
            else if(arr[mid] == target)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("found");
        }
        else
            System.out.println("not found");
        
    }
}