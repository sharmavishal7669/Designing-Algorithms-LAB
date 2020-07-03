import java.util.Scanner;

public class RecursiveLinearSearch {

    static int recursiveLinearSearch(int arr[], int l, int r, int element)
    {
        if(r<0)
            return -1;
        if(arr[l]==element)
            return l;
        if(arr[r]==element)
            return r;
        return(recursiveLinearSearch(arr,l+1,r-1,element));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        arr = LinearSearch.randomArray(size);
        System.out.printf("Enter an element(0-%d) to search : ",size-1);
        int element = sc.nextInt();
        int response = recursiveLinearSearch(arr,0,size-1,element);
        if(response==-1)
            System.out.println("Not Found!");
        else
            System.out.printf("Your element %d is found at %d",element,response);
    }
}
