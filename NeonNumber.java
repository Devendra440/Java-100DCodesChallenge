import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq=n*n;
        int add =0;
        while(sq>0){
            add+=sq%10;
            sq/=10;
        }
        if(n==add){
            System.out.println("Neon Number");
        }else{
            System.out.println("not Neon Number");
        }
    }
    
}
