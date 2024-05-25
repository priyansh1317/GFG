//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public static Long gcd(Long a, Long b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
        // if(a<b){
            
        //     for(Long i=a; i>1; i--){
        //         if(a%i==0 && b%i==0) return i;
        //     }
            
        // }
        // else{
            
        //     for(Long i=b; i>1; i--){
        //         if(a%i==0 && b%i==0) return i;
        //     }
           
        // }
        // return 1L;
    }
    
    public static Long lcm(Long a, Long b){
        Long lcm = (a*b)/gcd(a,b);
        return lcm;
    }
    
    static Long[] lcmAndGcd(Long A , Long B) {
        Long[] arr = {lcm(A,B) , gcd(A,B)};
        return arr;
    }
}