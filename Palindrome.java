import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int n = sc.nextInt();
        int a = n;
        int rev = 0;

        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a /= 10;
        }

        if (n == rev) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is not a Palindrome");
        }

        sc.close();
    }
}
