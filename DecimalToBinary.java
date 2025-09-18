import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = "";
        int number = decimal;

        if (number == 0) {
            binary = "0";
        } else {
            while (number > 0) {
                int digit = number % 2;
                binary = digit + binary;
                number /= 2;
            }
        }

        System.out.println(binary);
    }
}
