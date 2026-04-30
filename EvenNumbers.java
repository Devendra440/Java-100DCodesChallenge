import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Even numbers from 1 to "+n+" are:");
        for(int i=1;i<=n;i++){
            // if(i%2==0){
            //     System.out.print(i+" ");
            // }
            i++;
            System.out.print(i+" ");
        }
    }
}
