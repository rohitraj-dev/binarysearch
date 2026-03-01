import java.util.*;
class SearchInSortedMatrix
{
    public static boolean searchMatrix(int arr[][], int target)
    {
        int rows = arr.length;
        int cols = arr[0].length;
        int lo = 0;
        int hi = rows*cols - 1;
        
        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int midRow = mid/cols;
            int midCol = mid%cols;
            if(arr[midRow][midCol] == target)
                return true;
            else if(arr[midRow][midCol] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return false;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = 
        {
            {1, 6, 12, 27, 32}, 
            {38, 41, 47, 49, 55}, 
            {67, 68, 75, 76, 81}, 
            {84, 89, 91, 92, 98}
        };
        System.out.print("enter target element : ");
        int target = sc.nextInt();
        System.out.println(searchMatrix(arr, target));
    }
}