import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int a = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }

        if (sum == a) {
            System.out.println(a + " is a Perfect Number.");
        } else {
            System.out.println(a + " is not a Perfect Number.");
        }

        sc.close();
    }
}
