// Name: Shubhendra Kushwaha
// Registration no.: 2241011241
// Problem Statement: https://cses.fi/problemset/task/1069

import java.util.Scanner;
public class Q3_1069 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int seqLength = 1;
        int maxSeqLength = 1;
        char prev = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==prev){
                seqLength++;
            }else{
                if(seqLength>maxSeqLength){
                    maxSeqLength = seqLength;
                }
                seqLength = 1;
            }
            prev = s.charAt(i);
        }
        if(seqLength>maxSeqLength){
            maxSeqLength = seqLength;
        }
        System.out.println(maxSeqLength);
        sc.close();
    }
    
}
