import java.util.Scanner;

public class CountNonSpaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}
