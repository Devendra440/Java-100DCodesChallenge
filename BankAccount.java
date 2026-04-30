import java.util.Scanner;
public class BankAccount{
    private static int amount;
    private static String name;
    private static int id;
    BankAccount(int amount,String name,int id){
        this.amount=amount;
        this.name=name;
        this.id=id;
    }
    public static void Depoist(int a){
        amount+=a;
        System.out.println("Total Balance is:"+amount);
    }
    public static void Withdrawal(int b){
        if(amount<b){
            System.out.println("Insufficent balance");
        }else{
            amount-=b;
        }
        System.out.println("Current balance is:"+amount);
    }
    public static void display(){
        System.out.println("Current balance is:"+amount);
    }
    public static void PrintDetails(){
        System.out.println(name+" "+id+" "+amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name="Deva";
        int id=1234567890;
        int amount=1000;
        int a = sc.nextInt();
        Depoist(a);
        int b = sc.nextInt();
        Withdrawal(b);
        display();
        PrintDetails();
    }
}