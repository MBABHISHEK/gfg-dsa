//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends

class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int start=0;
        int end=0;
        
        while(end<n)
        {
             map.put(A[end],map.getOrDefault(A[end],0)+1);
             
             if((end-start)+1<k)
             {
                 end++;
             }
             else if((end-start+1)==k)
             {
                  list.add(map.size());
                  map.put(A[start],map.get(A[start]) - 1);
                  
                  if(map.get(A[start])==0)
                  {
                      map.remove(A[start]);
                  }
                  start++;
                  end++;
             }
        }
        
        return list;
        // code here 
    }
}

