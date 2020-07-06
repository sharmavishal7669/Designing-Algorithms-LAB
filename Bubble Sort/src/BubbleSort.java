import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    static int[] bubbleSort(int[] arr)       //Function For Sorting The Array. Takes the array to be sorted as parameter
    {
        int temp;
        int length = arr.length;
        for(int i=0;i<length-1;i++)             //loop for unsorted array
        {
            for(int j=0;j<length-i-1;j++)       //greatest will be in last position of unsorted array
            {
                if(arr[j]>arr[j+1])             //swap
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
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

    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        arr = randomArray(size);

        System.out.println("Your Array is being SORTED! ");
        int[] response = bubbleSort(arr);
        System.out.printf(Arrays.toString(response));

    }
}
