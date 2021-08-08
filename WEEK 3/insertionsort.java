import java.util.*;
class insertionsort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();         //test-cases
        while(t-- != 0)
        {
        int n=sc.nextInt(); // array size
        int arr[]=new int[n]; //array
        
        for(int i = 0; i < n; i++) //entering array elements
        {
            arr[i]=sc.nextInt();
        }


      int i, j, temp,swaps=0,comp=0;
      int l=arr.length;   //variables to find out swaps and comparisons

/*Sort*/
      for (i = 1; i < l; i++) 
      {
      j = i;
      swaps++;
      while ((j > 0) && (arr[j - 1] > arr[j]))
      {
            if(arr[j-1]>arr[j]){
            swaps++;
      }

        temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;

        comp++;   
    }
}
/* Print */

      for (i = 0; i < n; i++)
          System.out.print(arr[i]+" ");
          System.out.println();

      System.out.println("comparisons="+comp);
      System.out.println("shifts="+swaps);
 }
 sc.close();
}
}