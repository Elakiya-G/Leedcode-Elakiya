// Last updated: 8/11/2026, 4:03:55 PM
class Solution {
        public boolean isHappy(int n){
            HashSet<Integer>seen = new HashSet<>();
            while(n!=1 && !seen.contains(n)){
                seen.add(n);
                n=getNext(n);
            }
            return n==1;
        }
        private int getNext(int n){
            int sum=0;
            while(n>0){
                int digit = n%10;
                sum += digit*digit;
                n/=10;
            }
            return sum;
        }
    }
