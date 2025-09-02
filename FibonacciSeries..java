import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms of Fibonacci series you want: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.println(a);
                int next = a + b;
                a = b;
                b = next;
            }
        }

        sc.close();
    }
}
