//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long N = Long.parseLong(stt.nextToken());
            long M = Long.parseLong(stt.nextToken());
            long X = Long.parseLong(stt.nextToken());
            long A[] = new long[(int)(N)];
            long B[] = new long[(int)(M)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < M; i++) {
                B[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            pair [] answer = obj.allPairs(A, B, N, M, X);
            int sz = answer.length;
            
            if(sz==0)
            System.out.println(-1);
            else{
                StringBuilder output = new StringBuilder();
                for(int i=0;i<sz;i++){
                    if(i<sz-1)
                    output.append(answer[i].first +" "+ answer[i].second + ", ");
                    else
                    output.append(answer[i].first +" "+ answer[i].second);
                    
                }
                System.out.println(output);
            }
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        ArrayList<pair> a = new ArrayList<>();
    Arrays.sort(A);
    Arrays.sort(B);
      
      int l=0,h=B.length-1;
      
      while(l<A.length && h>=0)
      {
          if(A[l]+B[h]==X)
          {
             pair p = new pair(A[l], B[h]);
                a.add(p);
              l++;
              h--;
          }
          else
           if(A[l]+B[h]<X)
           l++;
           else
           h--;
      }
        pair pairs[] = new pair[a.size()];
        pairs=a.toArray(pairs);
        
     return pairs;
        
      /*set approach
      List<pair> list = new ArrayList<>();
        
        Set<Long> seta = new HashSet<>();
        
        for (long p : A) {
            seta.add(p);
        }

        for (long p : B) {
            long complement = X - p;
            if (seta.contains(complement)) {
                list.add(new pair(complement, p));
            }
        }

        return list.toArray(new pair[0]);*/
         /*brute force solution
        for(int i=0;i<N;i++)
        {
           for(int j=0;j<M;j++)
           {
               if(A[i]+B[j]==X)
               list.add(new pair(A[i],B[j]));
           }
        }*/
    
    }
}
