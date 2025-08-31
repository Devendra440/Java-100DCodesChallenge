import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int n = sc.nextInt();
        checkfacto(n);
        sc.close();
    }
    public static void checkfacto(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        System.out.println("Factorial: " + facto);
    }
}
