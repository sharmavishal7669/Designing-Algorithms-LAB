import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {

        static int[] insertionSort(int[] arr)
        {
            int temp ;
            for(int i=1;i<arr.length;i++)
            {
                for(int j=i;j>0;j--)
                {
                    if(arr[j]<arr[j-1])
                    {
                        temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                    else
                        break;
                }
            }
            return arr;
        }

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

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array : ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            arr = randomArray(size);
            System.out.println("Your Array is being SORTED! ");
            int[] response = insertionSort(arr);
            System.out.printf(Arrays.toString(response));

        }
}
