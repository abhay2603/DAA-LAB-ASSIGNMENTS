import java.util.*;
import java.io.*;
class keyDifference 
{

	static int countPairsWithDiffK(int arr[],int n, int k)
	{
		int count = 0;

		// Pick all elements one by one
		for (int i = 0; i < n; i++)
		{
			// See if there is a pair
			// of this picked element
			for (int j = i + 1; j < n; j++)
				if (arr[i] - arr[j] == k ||arr[j] - arr[i] == k)
					count++;
		}
		return count;
	}

	// Driver code
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//test-cases
        while(t-- != 0)
        {
        int n=sc.nextInt(); // array size
        int arr[]=new int[n]; //array
        for(int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();  //key differece to be checked
		
		System.out.println("Count of pairs with given diff is " + countPairsWithDiffK(arr, n, k));
    }
    sc.close();
}
}