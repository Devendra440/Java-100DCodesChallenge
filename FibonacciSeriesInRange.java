import java.util.Scanner;

class FibonacciSeriesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci numbers in range [" + start + ", " + end + "]:");

        while (a <= end) {
            if (a >= start) {
                System.out.println(a);
            }
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
