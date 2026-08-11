// Last updated: 8/11/2026, 4:01:07 PM
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>(
            (a,b)->Double.compare(
                (double) arr[a[0]]/arr[a[1]],
                (double) arr[b[0]]/arr[b[1]]
            )
        );
        int n = arr.length;
        for(int i =0;i < n-1;i++){
            pq.offer(new int[]{i,n-1});
        }
        while(--k>0){
            int[] curr =pq.poll();
            int i = curr[0];
            int j= curr[1];
            if(j-1>i){
                pq.offer(new int[]{i,j-1});
            }
        }
        int []ans = pq.poll();
        return new int[]{arr[ans[0]],arr[ans[1]]};
    }
}