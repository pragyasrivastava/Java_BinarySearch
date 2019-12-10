import java.util.Scanner;

public class BinarySearch {

    public static void main (String [] args){

        Scanner in = new Scanner (System. in);

        System.out.println(" Enter the array size");

        int n = in.nextInt();

        int [] arr = new int [n];

        System.out.println("Enter the array elements");

        for (int i=0; i<n;i++){

            arr[i]= in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key= in.nextInt();
        int low = 0;
        int high= n-1;
        int mid = 0;

        while (low<=high){
            mid= (low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element is found at" + mid);
                break;
            }
            else if (arr[mid]>key){
                high= mid-1;
            }
            else if (arr[mid]<key){
                low =mid+1;
            }
        }
        if (low>high){
            System.out.println("Element is not found in the array");
        }
    }
}
