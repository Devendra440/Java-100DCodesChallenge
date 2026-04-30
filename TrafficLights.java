import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        switch(a){
            case "Red":
                System.out.println("Stop the Vehicle.....");
                break;
            case "Yellow":
                System.out.println("Wait for Signal...");
                break;
            case "Green":
                System.out.println("Ready to Go.....");
                break;
            default:
                System.out.println("Wrong light....");
        }
    }
}
