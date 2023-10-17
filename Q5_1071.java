//Name: Shubhendra Kushwaha
//Registration no.: 2241011241
//Problem Statement: https://cses.fi/problemset/task/1071
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String[] line = br.readLine().split(" ");
            long y = Long.parseLong(line[0]);
            long x = Long.parseLong(line[1]);
            long val = 0;
            if(x>y){
                if(x%2==0){
                    val = (x-1)*(x-1);
                    val += y;
                }else{
                    val = x*x;
                    val -= (y-1);
                }
            }else{
                if(y%2==0){
                    val = y*y;
                    val -= (x-1);
                  
                }else{
                    val = (y-1)*(y-1);
                    val += x;
           
                }
            }
            System.out.println(val);

    }

}
}