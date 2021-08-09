import java.util.*;
class selectionsort
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

    int i, j, temp;
    int comp = 0;
    int swaps = 0;
    int l=arr.length;

    for (i = 0; i < l; i++)
    {
        for (j = i + 1; j < l; j++)
        {
            comp+=1;
            swaps = swaps + 1;
            if (arr[i] > arr[j])
            {
                
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
for (i = 0; i < n; i++)   //printing the sorted array
System.out.print(arr[i]+" ");
System.out.println();

System.out.println("comparisons="+comp);
System.out.println("shifts="+swaps);
sc.close();
    }
}
}