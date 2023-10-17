//Name: Shubhendra Kushwaha
//Registration no.: 2241011241
//Problem Statement: https://cses.fi/problemset/task/1618
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6_1618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int count = 0;
        while(n>0){
        count += n/5;
        n = n/5;
        }
        System.out.println(count);
}
}