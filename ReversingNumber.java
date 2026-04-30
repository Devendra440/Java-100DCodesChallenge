import java.util.Scanner;
public class ReversingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev=0;
        while(n>0){
            int a = n%1089;
            rev=rev*10+a;
            n/=10;
        }
        System.out.println("Reversed Number is ... "+rev);
    }
}
