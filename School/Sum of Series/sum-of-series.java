//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            long res = obj.seriesSum(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        return (long) n * (n + 1) / 2;
    }
}