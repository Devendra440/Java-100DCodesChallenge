import java.util.Scanner;

public class BitFlip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0, power = 1;

        while (n > 0) {
            int bit = n % 2;        // extract binary bit
            bit = 1 - bit;          // flip bit
            result += bit * power;  // build decimal value
            power *= 2;
            n /= 2;
        }

        System.out.println(result);
    }
}
