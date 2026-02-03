import java.util.Scanner;

class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        performAddition(s1,s2);
    }
    public static void performAddition(String s1,String s2){
        int n1=Integer.parseInt(s1,2);
        int n2 = Integer.parseInt(s2,2);
        int sum = n1+n2;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
    }
}
