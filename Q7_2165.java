//Name: Shubhendra Kushwaha
//Registration no.: 2241011241
//Problem Statement: https://cses.fi/problemset/task/2165
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_2165 {

    public static void towerOfHanoi(int n, int src, int dest, int aux){
        if(n==1){
            System.out.println(src+" "+dest);
            return;
        }
        towerOfHanoi(n-1, src, aux, dest);
        System.out.println(src+" "+dest);
        towerOfHanoi(n-1, aux, dest, src);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((int)(Math.pow(2, n) -1));
        towerOfHanoi(n, 1, 3, 2);
}
}