import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        int temp = Math.abs(num);
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (num < 0) {
            rev = -rev;
        }
        System.out.println("Reverse of " + original + " is: " + rev);
        sc.close();
    }
}
