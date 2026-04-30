import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int b=n;
        int rev=0;
        while(n>0){
            int a = n%10;
            rev=rev*10+a;
            n/=10;
        }
        if(rev==b){
            System.out.println("Given number is  a palindorme");
        }else{
            System.out.println("Given number is not a palindrome");
        }
    }
}
