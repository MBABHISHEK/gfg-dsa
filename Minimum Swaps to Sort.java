int[] temp=Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        
        HashMap<Integer,Integer> hash=new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            hash.put(temp[i],i);
        }
        int ans=0;
        int left=0;
        while(left<nums.length){
            
            if(left==hash.get(nums[left])){
                left++;
            }
            else{
                int tem=nums[hash.get(nums[left])];
                nums[hash.get(nums[left])]=nums[left];
                nums[left]=tem;
                ans++;
                
            }
        }
        return ans;
