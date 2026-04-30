import java.util.Scanner;

public class GradeToMarks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a>='A' && a<='Z' || a>='a' && a<='z'){
            System.out.println("Valid Grade");
            if(a=='A'||a=='a'){
                System.out.println("MArks are between 91-100");
        }else if(a=='B'||a=='b'){
                System.out.println("MArks are between 76-90");
        }else if(a=='C'||a=='c'){
                System.out.println("MArks are between 51-75");
        }else if(a=='D'||a=='d'){
                System.out.println("MArks are between 36-50");
        }else if(a=='F'||a=='f'){
                System.out.println("MArks are between 0-35");
            }else{
                System.out.println("Enter the Valid Grade");
            }
        }else{
            System.out.println("Enter the Valid Grade");
        }
    }
}
