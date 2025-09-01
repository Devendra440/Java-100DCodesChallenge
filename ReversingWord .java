import java.util.Scanner;

class ReversingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to Reverse:");
        String a = sc.nextLine();
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        sc.close();
    }
}
