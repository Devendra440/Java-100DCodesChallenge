import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        byte number1 = sc.nextByte();
        System.out.println("You entered: " + number1);
        System.out.println("Enter the Number:");
        int number2 = sc.nextInt();
        System.out.println("You entered: " + number2);
        System.out.println("Enter the Number:");
        short number3 = sc.nextShort();
        System.out.println("You entered: " + number3);
    }
}
