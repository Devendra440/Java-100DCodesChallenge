import java.util.Scanner;

public class Emplyee{
    int id;
    String name;
    double salary;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Emplyee obj = new Emplyee();
        obj.setId(sc.nextInt());
        sc.nextLine();
        obj.setName(sc.nextLine());
        obj.setSalary(sc.nextDouble());
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
        sc.close();
    }
}


// import java.util.Scanner;

// class Main {
//     private int id;
//     private String name;
//     private double salary;

//     public void setId(int id) {
//         this.id = id;
//     }
//     public int getId() {
//         return id;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setSalary(double salary) {
//         this.salary = salary;
//         if(checkSalary(salary)){
//             System.out.println("avg Pacakge");
//         }else{
//             System.out.println("noo avg Pacakge");
//         }
//     }
//     public double getSalary() {
//         return salary;
//     }
    
//     private boolean checkSalary(double salary){
//         return salary >=15000;
//     }
    
//     public void display(){
//         System.out.println(name);
//         System.out.println(id);
//         System.out.println(salary);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Main obj = new Main();

//         System.out.print("Enter ID: ");
//         obj.setId(sc.nextInt());
//         sc.nextLine(); 

//         System.out.print("Enter Name: ");
//         obj.setName(sc.nextLine());

//         System.out.print("Enter Salary: ");
//         obj.setSalary(sc.nextDouble());

//         // System.out.println("ID: " + obj.getId());
//         // System.out.println("Name: " + obj.getName());
//         // System.out.println("Salary: " + obj.getSalary());
//         obj.display();
//     }
// }
