import java.util.Scanner;

class PrimeCheckInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting value: ");
        int a = sc.nextInt();
        System.out.print("Enter an ending value: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            checkPrime(i);
        }

        sc.close();
    }

    public static void checkPrime(int n) {
        if (n < 2) {
            System.out.println(n + " is not a Prime Number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
