//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        
        String CommonPrefix=arr[0];
        /*Since all the String in tyhe given array should have the same pattern
        hence consider the first string as reference and updated in the next itertartions*/
        for(int i=1;i<n;i++)
        {
            int x=0;
            String cp="";
            
            while(x<CommonPrefix.length()&&x<arr[i].length()&&CommonPrefix.charAt(x)==arr[i].charAt(x))
            {
                /*update the cp if the character are matching*/
                cp+=arr[i].charAt(x);
                x++;
            }
            
            if (!cp.equals(CommonPrefix)) {
              CommonPrefix = cp;
             }
        }
        
        return CommonPrefix==""?"-1":CommonPrefix;
    }
}
