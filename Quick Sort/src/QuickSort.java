import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort
{
    /* low  --> Starting index,  high  --> Ending index */
    static int[] quickSort(int arr[],int low,int high)
    {
        if (low < high)
        {
        /* pi is partitioning index, arr[pi] is now
           at right place */
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
        return arr;
    }

    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    static int partition (int arr[],int low,int high)
    {
        // pivot (Element to be placed at right position)
        int pivot = arr[high];

        int i = (low - 1);  // Index of smaller element
        int temp;
        for (int j = low; j <= high- 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;    // increment index of smaller element

                //swap arr[i] and arr[j]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        //swap arr[i + 1] and arr[high])
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    //Method to generate a random array of size n
    static int[] randomArray(int n)
    {
        int[] randArray = new int[n];
        Random rand = new Random();
        for(int i=0;i<n;i++)
        {
            randArray[i] = rand.nextInt(n+1);
        }
        System.out.println("Random Array is created !");
        System.out.println(Arrays.toString(randArray));
        return randArray;
    }

    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        arr = randomArray(size);

        System.out.println("Your Array is being SORTED! ");
        int[] response = quickSort(arr,0,size-1);
        System.out.printf(Arrays.toString(response));

    }
}
