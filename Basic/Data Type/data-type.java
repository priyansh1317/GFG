//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        switch (str) {
            case "Character":
             return 1;
            case "Integer":
             return Integer.SIZE / 8;
            case "Long":
             return Long.SIZE / 8;
            case "Float":
             return Float.SIZE / 8;
            case "Double":
             return Double.SIZE / 8;
            default:
             return -1; 
            }
        // if(str=="Character") return (Character.SIZE/8);
        // else if(str=="Integer") return (Integer.SIZE/8);
        // else if(str=="Long") return (Long.SIZE/8);
        // else if(str=="Float") return (Float.SIZE/8);
        // else if(str=="Double") return (Double.SIZE/8);
        // else return -1;
    }
}