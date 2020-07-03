import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int[] arr, int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
                return i;
        }
        return -1;
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
        System.out.println("Enter an element(0-99) to search : ");
        int element = sc.nextInt();
        int response = linearSearch(arr,element);
        if(response==-1)
            System.out.println("Not Found!");
        else
            System.out.printf("Your element %d is found at %d",element,response);

    }
}
