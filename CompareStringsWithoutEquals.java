import java.util.Scanner;

public class CompareStringsWithoutEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean same = true;

        if (str1.length() != str2.length()) {
            same = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        if (same) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
