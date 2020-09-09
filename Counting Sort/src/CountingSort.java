import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CountingSort {
    static int[] countingSort(int[] arr,int range)  //Function For Sorting The Array. Takes the array to be sorted as parameter
    {
        int[] count = new int[range+1];             //new count arr of given range

        int size = arr.length;

        for(int i=0;i<size;i++)              //count occurrences
        {
            count[arr[i]]++;
        }

        for(int i=1;i<count.length;i++)
        {
            count[i]+=count[i-1];
        }

        int[] output = new int[size];

        for(int i=size-1;i>=0;i--)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        return output;
    }

    static int[] randomArray(int n, int range)                 //Method to generate a random array of size n
    {
        int[] randArray = new int[n];
        Random rand = new Random();
        for(int i=0;i<n;i++)
        {
            randArray[i] = rand.nextInt(range+1);
        }
        System.out.println("Random Array is created !");
        System.out.println(Arrays.toString(randArray));
        return randArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        System.out.println("Enter range of elements  0  to   : ");
        int range = sc.nextInt();

        int[] arr = new int[size];
        arr = randomArray(size,range);

        System.out.println("Your Array is being SORTED! ");
        int[] response = countingSort(arr, range);
        System.out.printf(Arrays.toString(response));
    }

}
