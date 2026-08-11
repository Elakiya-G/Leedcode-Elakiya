// Last updated: 8/11/2026, 3:58:33 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long g = gcd(nums[i],nums[j]);
                long strength=(1L*nums[i]*nums[j])/(g*g);
                max=Math.max(max,strength);
            }
        }
        return max;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}