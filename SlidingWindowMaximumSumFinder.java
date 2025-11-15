import java.util.Scanner;

class SlidingWindowMaximumSumFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if(k > n){
            System.out.println("Invalid window size");
            return;
        }

        int windowsum = 0;

        for(int i = 0; i < k; i++){
            windowsum += arr[i];
        }

        int maxsum = windowsum;

        for(int end = k; end < n; end++){
            windowsum += arr[end];
            windowsum -= arr[end - k];

            if(windowsum > maxsum){
                maxsum = windowsum;
            }
        }

        System.out.println(maxsum);
    }
}
