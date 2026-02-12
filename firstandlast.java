import java.util.*;
class firstandlast
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ans = new ArrayList<>();
        int arr[] = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int target = 5;

        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        // int flag = 0;
        // int firstidx = -1;
        // int lastidx = -1;
        int idx = -1;

        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            if(arr[mid] > target)
                hi = mid - 1;
            else if(arr[mid] < target)
                lo = mid + 1;
            // if(arr[mid] == target)
            // {
            //     flag = 1;
            //     firstidx = mid;
            //     hi = mid - 1;
            // }
            // if(arr[mid] == target)
            // {
            //     flag = 1;
            //     lastidx = mid;
            //     lo = mid + 1;
            // }
            else 
            {
                idx = mid;
                lo = mid + 1;
            }
        }
        ans.add(idx);
        lo = 0;
        hi = arr.length - 1;
        mid = 0;
        idx = -1;

        while(lo <= hi)
        {
            mid = (lo + hi) / 2;
            if(arr[mid] > target)
                hi = mid - 1;
            else if(arr[mid] < target)
                lo = mid + 1;
            else
            {
                idx = mid;
                hi = mid - 1;
            }
        }
        ans.add(idx);
        System.out.println(ans);
        //if(flag == 1)
        // {
        //     System.out.println("found first at : "+firstidx);
        //     System.out.println("found last at : "+lastidx);
        // }
    }
}