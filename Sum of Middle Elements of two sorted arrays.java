class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int low = 0, high = n, medianInd = (n+n+1)/2;
        
        while(low<=high){
            
            int mid1 = (low+high)/2;
            int mid2 = medianInd-mid1;
            
            int left1 = (mid1==0)?Integer.MIN_VALUE:ar1[mid1-1];
            int right1 = (mid1==n)?Integer.MAX_VALUE:ar1[mid1];
            int left2 = (mid2==0)?Integer.MIN_VALUE:ar2[mid2-1];
            int right2 = (mid2==n)?Integer.MAX_VALUE:ar2[mid2];
            
            if(left1<=right2 && left2 <= right1)return Math.max(left1,left2)+Math.min(right1,right2);
            
            if(left1>right2)high = mid1-1;
            else low = mid1+1;
        }
        return 0;
    }
}
