public class SumofNumbers {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=50;i++){
            sum+=i;
            System.out.println((i-1)+" + "+i+" = "+sum);
        }
    }
}
