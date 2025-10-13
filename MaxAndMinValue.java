import java.util.Scanner;

class MaxAndMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];  // Update max
            }
            if(arr[i] < min) {
                min = arr[i];  // Update min
            }
        }

        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}
