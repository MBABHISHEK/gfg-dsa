

//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        
        Map<Long,Integer>map=new HashMap<>();
        
        
        for(long x:a1)
        {
            if(map.containsKey(x))
            {
                map.put(x,map.get(x)+1);
            }
            else
            {
                map.put(x,1);
            }
        }
        
        for(long x:a2)
        {
            
            if(map.containsKey(x))
            {
                if(map.get(x)==1)
                map.remove(x);
                else
                map.put(x,map.get(x)-1);
                
            }
            else
            return "No";
        }
        
        return "Yes";
    }
}
