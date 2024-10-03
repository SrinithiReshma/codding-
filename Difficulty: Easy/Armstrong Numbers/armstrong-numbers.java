//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int ori=n;
        int ones=n%10;
        n=n/10;
        int tens=n%10;
        n=n/10;
        int hundreadth=n%10;
        int s=0;
        s=(int)Math.pow(ones,3);
        s=s+(int)Math.pow(tens,3);
        s=s+(int)Math.pow(hundreadth,3);
        
        if (ori==s)
        return "true";
        else
        return "false";
    }
}