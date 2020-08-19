import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeapSort {
    static int[] heapSort(int[] arr)       //Function For Sorting The Array. Takes the array to be sorted as parameter
    {
        int temp;
        int length = arr.length;
        for(int i = (length/2)-1; i>=0; i--)
        {
            heapify(arr, length, i);
        }

        for(int i=length-1; i>=0; i--)
        {
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, i, 0);
        }

        return arr;
    }

    static void heapify(int[] arr, int length, int i)
    {
        int largest = i;
        int left = (i*2)+1;
        int right = (i*2)+2;
        int temp;

        if(right<length && arr[right]>arr[largest])
        {
            largest = right;
        }

        if(left<length && arr[left]>arr[largest])
        {
            largest = left;
        }

        if(largest!=i)
        {
            temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, length, largest);
        }

    }


    static int[] randomArray(int n)                 //Method to generate a random array of size n
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        arr = randomArray(size);

        System.out.println("Your Array is being SORTED! ");
        int[] response = heapSort(arr);
        System.out.print(Arrays.toString(response));

    }
}
