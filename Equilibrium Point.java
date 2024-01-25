https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
        return 1;
        long leftsum=0;
        
        for(int i=1;i<n;i++)
        {
            leftsum+=arr[i];
        }
        long rightsum=arr[0];
        for(int i=1;i<n;i++)
        {
            leftsum-=arr[i];
            if(leftsum==rightsum)
            {
                return i+1;
            }
            rightsum+=arr[i];
        }
        return-1;
    }
}
