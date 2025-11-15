import java.util.Scanner;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                b += ch;
            }
        }

        System.out.println(b);
    }
}
