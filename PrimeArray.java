import java.util.Scanner;

public class PrimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("prime numbers");
        for(int i=0;i<n;i++){
            Prime(arr[i]);

            
        }
    }
    public static void Prime(int n){
        boolean isPrime = true;
        if(n<=1){
            isPrime=false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            
        }
       if(isPrime){
        System.out.print(n + " ");
       }
    }
}
//Strong numbers in the array - 0,5,2,1,7,4,9
//perfect numbers in the array - 1,3,6,5,12,28,34