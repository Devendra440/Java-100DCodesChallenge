import java.util.Scanner;

class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        String n = sc.nextLine().toLowerCase();

        int cCount = 0;
        int vCount = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);

            if (ch >= 'a' && ch <= 'z') {  
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
                } else {
                    cCount++;
                }
            }
        }

        System.out.println("Consonants: " + cCount);
        System.out.println("Vowels: " + vCount);
        sc.close();
    }
}
