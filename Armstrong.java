// import java.util.Scanner;
// public class Armstrong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a=n;
//         int sum=0;
//         int digit = String.valueOf(n).length();

//         while(n>0){
//             int rem = n%10;
//             sum+= Math.pow(rem, digit);
//             n/=10;
//         }

//         if(sum==a){
//             System.out.println("Armstrong");
//         }
//         else{
//             System.out.println("Not Armstrong");
//         }
//     }
// }

// sum of the didigits raised to the power of number of digits is equal to the number itself.