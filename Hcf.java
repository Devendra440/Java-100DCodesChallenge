import java.util.Scanner;

class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter b value:");
        int b = sc.nextInt();
        int max =Math.min(a,b);
        int temp = 0;;
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
                temp=i;
            }
        }
        System.out.println(temp);
    }
}
