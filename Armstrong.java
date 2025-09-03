import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        int org = a;
        int temp = 0;

        int digitCount = String.valueOf(a).length();

        while (a > 0) {
            int digit = a % 10;
            temp += Math.pow(digit, digitCount);
            a /= 10;
        }

        if (temp == org) {
            System.out.println(org + " is an Armstrong number");
        } else {
            System.out.println(org + " is not an Armstrong number");
        }

        sc.close();
    }
}
