import java.util.*;
class DuplicateKey
{
    // If `searchFirst` is true, return the
    // first occurrence of the number; otherwise, return its last occurrence.

    public static int binarySearch(int[] arr, int x, boolean searchFirst)
    {
        int left = 0;
        int right = arr.length - 1;

        int result = -1;
 
        while (left <= right)
        {
            
            int mid = (left + right) / 2;
 
            if (x == arr[mid])
            {
                result = mid;
 
                // searching towards the left (lower indices)
                if (searchFirst)
                {
                    right = mid - 1;
                }
                // searching towards the right (higher indices)
                else 
                {
                    left = mid + 1;
                }
            }
 
            // if the target is less than the middle element, discard the right half
            else if (x < arr[mid]) 
            {
                right = mid - 1;
            }
            // if the target is more than the middle element, discard the left half
            else 
            {
                left = mid + 1;
            }
        }
        // return the found index or -1 if the element is not found
        return result;
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER THE array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("ENTER THE key element (whose occurences are to be found)");
        int key=sc.nextInt();
 
        // pass true for the first occurrence
        int first = binarySearch(arr, key, true);
 
        // pass false for the last occurrence
        int last = binarySearch(arr, key, false);
        int c = last - first + 1;   //to count no of occurences
 
        if (first != -1) 
        {
            System.out.println("Element " + key + " occurs " + c + " times");
        }
        else 
        {
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}
