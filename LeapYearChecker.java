import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check whether it is a leap year or not: ");
        int n = sc.nextInt();

        if (n % 400 == 0) {
            System.out.print(n + " is a leap year.");
        } else if (n % 4 == 0 && n % 100 != 0) {
            System.out.print(n + " is a leap year.");
        } else {
            System.out.print(n + " is not a leap year.");
        }

        sc.close();
    }
}
