import java.util.Scanner;

class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int a = sc.nextInt();

        System.out.print("Enter another value: ");
        int b = sc.nextInt();

        System.out.println("Values before Swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after Swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        sc.close();
    }
}
