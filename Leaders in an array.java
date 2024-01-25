
/*this is brutte force one */
 static ArrayList<Integer> leaders(int arr[], int n){
        int flag=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            flag=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                 flag=1;
                }
            }
            if(flag==0)
            list.add(arr[i]);
        }
        return list;
    }


/*this optimize one*/
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        int flag=0;
        ArrayList<Integer> list=new ArrayList<>();
        int maxRight=arr[n-1];
        list.add(maxRight);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=maxRight)
            {
                maxRight=arr[i];
               list.add(maxRight);
            }
            
        }
        Collections.reverse(list);
        return list;
    }
}
