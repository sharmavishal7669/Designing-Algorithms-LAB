import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertionSort {

    static int[] recursiveInsertionSort(int[] arr,int n)
    {
        //best case
        if(n<=1)
        {
            return arr;
        }

        recursiveInsertionSort( arr, n-1 );

        // Insert last element at its correct position in sorted array.
        int last = arr[n-1];
        int j = n-2;

        /* Move elements of arr[0 to i-1], that are greater than key,
          to one position ahead of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        arr = InsertionSort.randomArray(size);
        System.out.println("Your Array is being SORTED! ");
        int[] response = recursiveInsertionSort(arr,size);
        System.out.printf(Arrays.toString(response));

    }
}
