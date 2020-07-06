import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort
{
    static int[] selectionSort(int[] arr)       //Function For Sorting The Array. Takes the array to be sorted as parameter
    {
        int length = arr.length;
        int temp,i,j,min;

        for(i=0;i<length-1;i++)                 //Loop for sorted array
        {
            int index=i;
            min = arr[i];
            for(j=i+1;j<length;j++)             //Loop for unsorted array
            {
                if(arr[j]<min)                  //Get minimum from unsorted array
                {
                    min = arr[j];
                    index = j;
                }
            }

            //Sets smallest from unsorted to the front
            if(index!=i)
            {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        arr = randomArray(size);

        System.out.println("Your Array is being SORTED! ");
        int[] response = selectionSort(arr);
        System.out.printf(Arrays.toString(response));

    }
}
