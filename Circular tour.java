

// In java function tour() takes two arguments array of petrol


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int have[], int needed[])
    {
        // an amaging problem, for which you need to remember the logic
        // here first of all if total gas < total cost then we cant comlete circle 
        // lets first code that 
        
        int total_have = 0;
        int total_needed = 0;
        for(int i = 0; i < have.length; i++){
            total_have += have[i];
            total_needed += needed[i];
        }
        if(total_have < total_needed){
            return -1;
        }
        
        // let's call the remaining fuel we have at a point as POWER
        
        // NOTE :: The correct start index is the index from which we can travel till end of the array
        
        // let ,w clear it for you...
        // we are checking from left to right
        // if we get some index 'i' from which we reach end of array it means that its the point from which we can collect max power
        
        int i = 0;
        int start = 0;
        int fuel = 0;
        while(i < have.length){
            fuel += have[i];
            if(fuel >= needed[i]){
                fuel -= needed[i];
                i++;
            } else {
                start = i + 1;
                i++;
                fuel = 0;
            }
            if(i == have.length - 1){
                return start;
            }
        }
        return -1;
    }
}                           

//{ Driver Code Starts
import java.util.*;


class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new Solution().tour(p,d));
		t--;
		}
	}
}
// } Driver Code Ends


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	int n=distance.length;
	int left=distance.length;
	int totalPetrol=0;
	int j=0;
	int start=0;
	
	    while(true)
	    {
	        if(left==0)
	        {
	            return start;
	        }
	    
	        if(j>n &&left==n)
	        break;
	    
	        totalPetrol=totalPetrol+petrol[j%n];
	    
	        if(totalPetrol<distance[j%n])
	        {
	            totalPetrol=0;
	            j++;
	            start=j%n;
	            left=n;
	        }
	        else
	        {
	          totalPetrol=totalPetrol=totalPetrol - distance[j%n];
	          left--;
	          j++;
	        }
	    }
	    return -1;
    }
}
