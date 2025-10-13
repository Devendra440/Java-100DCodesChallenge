import java.util.Scanner;

class MinAndSecMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int secmax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secmax && arr[i] < max) {
                secmax = arr[i];
            }
        }

        System.out.println("Second Max: " + secmax);
        System.out.println("Min: " + min);
    }
}
