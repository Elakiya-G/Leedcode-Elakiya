// Last updated: 8/11/2026, 3:58:36 PM
class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD =1000000007L;
            long maxOps=0;
        long prefixSum=0;
        for(int num:nums){
            prefixSum +=num;
            long opsNeeded = (prefixSum+k-1)/k-1;
            if(opsNeeded>maxOps){
                maxOps = opsNeeded;
            }
        }
        long totalcost=0;
        if(maxOps % 2==0){
            totalcost=((maxOps/2)%MOD)*((maxOps+1)%MOD);
            
        }
        else{
            totalcost = (maxOps%MOD)*(((maxOps+1)/2)%MOD);
        }
        return(int)(totalcost%MOD);
    }
}