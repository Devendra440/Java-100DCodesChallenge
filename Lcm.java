import java.util.Scanner;

class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter b value:");
        int b = sc.nextInt();
        int max =Math.max(a,b);
        int i= max;
        while(true){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
