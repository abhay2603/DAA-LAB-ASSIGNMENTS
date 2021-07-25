
import java.util.*;
class binarysearch
{
    static int c=0;
    static int bsearch(int []arr,int l,int h, int x)
    {
      
        if(l>h)                        //base case
        return -1;
        int mid=(l+h)/2;
        c+=1;
        
        if(arr[mid]==x)
        return mid;
        else if(arr[mid]>x)
        return bsearch(arr,l,mid-1,x);
        else
        return bsearch(arr,mid+1,h,x);
    }

    //driver code
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
    
        int found_index = bsearch(arr,0,n-1,x);
        if (found_index == -1)
        {
            System.out.println("Element is not present in array");
            System.out.println("comparisons="+c);
        }
        else
        {
            System.out.println("Element is present at index" + found_index);
            System.out.println("comparisons="+c);
        }
        sc.close();
    }
}
