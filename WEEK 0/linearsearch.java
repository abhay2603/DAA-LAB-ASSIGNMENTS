import java.util.*;
class linearsearch
{
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return n;
    }
 
    // Driver code
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x=sc.nextInt();
 
        // Function call
        int result = search(arr, x);
        if (result == n)
            System.out.print("Element is not present in array");
        else
            System.out.println("Element is present at index" + result);
            System.out.println("No of comparisons="+ (result+1));
    }
}