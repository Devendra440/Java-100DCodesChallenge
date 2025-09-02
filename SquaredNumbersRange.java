import java.util.Scanner;

class SquaredNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value to start: ");
        int s = sc.nextInt();

        System.out.print("Enter a value to end: ");
        int e = sc.nextInt();

        for (int i = s; i <= e; i++) {
            int square = i * i;
            System.out.println(i + " squared is " + square);
        }

        sc.close();
    }
}
