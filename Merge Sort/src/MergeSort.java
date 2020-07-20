import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MergeSort {

    //Sorting Function
    static int[] mergeSort(int[] arr, int l, int r)
    {
        if(r>l)
        {
            int m = (l+r)/2;                            //mid index
            mergeSort(arr, l, m);                       //sort left sub array
            mergeSort(arr, m+1 , r);                 //sort right sub array
            merge(arr, l, m, r);                        //merge all the sub arrays
        }

        return arr;
    }

    //Merging Function
    static void merge(int[] arr, int l, int m, int r)
    {
        int lsize = m-l+1;                              //left sub array size
        int rsize = r-m;                                //right sub array size
        int[] L = new int[lsize];                       //temporary left array
        int[] R = new int[rsize];                       //temporary right array

        for(int i=0;i<lsize;i++)                        //copy elements to left sub array
        {
            L[i] = arr[l+i];
        }
        for(int i=0;i<rsize;i++)                        //copy elements to right sub array
        {
            R[i] = arr[m+1+i];
        }


        int i=0;
        int j=0;                                    //initial index of temp sub arrays
        int k = l;

        while (i < lsize && j < rsize) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<lsize)                                  //Copy the remaining elements of left subarray (if any)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<rsize)                                 //Copy the remaining elements of right subarray (if any)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
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
        System.out.println();
        System.out.println("Your Array is being SORTED! ");
        int[] response = mergeSort(arr,0,arr.length-1);
        System.out.printf(Arrays.toString(response));

    }
}
