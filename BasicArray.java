// import java.util.Arrays;
import java.util.Scanner;
public class BasicArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are:.....");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        // System.out.println("Reversed Elements are:.....");
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }
        // // System.out.println(Arrays.toString(arr));
        // //Method Two
        // System.out.println();
        // for(int i=1;i<=n/2;i++){
        //     int temp = arr[i-1];
        //     arr[i-1]=arr[n-i];
        //     arr[n-i]=temp;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------

        // //merge two given arrays
        // //a1={10,20,30,40,50}
        // //a2={1,2,3,4,5}
        // //op={10 20 30 40 50 1 2 3 4 5 }

        // int[] a1={10,20,30,40,50};
        // int[] a2={1,2,3,4,5};

        // int n1 = a1.length;
        // int n2 = a2.length;
        // int[] m = new int[n1+n2];

        // for(int i=0;i<n1;i++){
        //     m[i]=a1[i];
        // }
        // for(int i=0;i<n2;i++){
        //     m[n1 + i]=a2[i];
        // }

        // for(int i=0;i<m.length;i++){
        //     System.out.println(m[i]+" ");
        // }


        //prime Numbers in the given array in the form of array



    }
}