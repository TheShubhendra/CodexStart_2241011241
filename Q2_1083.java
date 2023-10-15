import java.util.Scanner;

public class Q2_1083 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for(int i=0; i<n-1; i++){
            sum += sc.nextLong();
        }
        long expectedSum = n*(n+1)/2;
        System.out.println(expectedSum- sum);
        sc.close();
    }
}
