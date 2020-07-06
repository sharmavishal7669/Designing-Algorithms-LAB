import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RecursiveBubbleSort {
    static int[] recursiveBubbleSort(int[] arr,int n)       //Function For Sorting The Array. Takes the array to be sorted as parameter
    {
        int temp;
        if(n==1)
        {
            return arr;
        }

        for(int i=0;i<n-1;i++)             //loop for unsorted array
        {
            if(arr[i]>arr[i+1]) {              //largest gets bubbled to end of unsorted array
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            recursiveBubbleSort(arr,n-1);       //recursive call to sorting method
        }
        return arr;
    }

    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        arr = BubbleSort.randomArray(size);

        System.out.println("Your Array is being SORTED! ");
        int[] response = recursiveBubbleSort(arr,size);
        System.out.printf(Arrays.toString(response));

    }
}
