import java.util.Scanner;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toUpperCase(a.charAt(i));
            b += ch;
        }

        System.out.println(b);
    }
}
