// public class Encaspulation {
//     private String name;
//     private int age;

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         if (age > 0) {
//             this.age = age;
//         } else {
//             System.out.println("Age must be positive.");
//         }
//     }
// }

public class Encaspulation {
    private int Pin;
    public int getPin(){                          
        return Pin;
    }
    public void setPin(int Pin){
        if(Pin>=1000 && Pin<=9999){
            this.Pin=Pin;
        }else{
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        Encaspulation ob = new Encaspulation();
        ob.setPin(0234);
        System.out.println(ob.getPin());
    }
}

