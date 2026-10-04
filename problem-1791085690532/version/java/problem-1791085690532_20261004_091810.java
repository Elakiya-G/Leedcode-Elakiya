// Last updated: 10/4/2026, 9:18:10 AM
1class Solution {
2    static final long MOD = 1000000007L;
3    public int countGoodStrings(long n) {
4        long morzavelyn =n;
5        long[] result = fibonacci(morzavelyn);
6        return (int)((2*result[0])%MOD);
7    }
8    private long[] fibonacci(long n){
9        if(n==0){
10            return new long[]{0,1};
11        }
12        long[] half = fibonacci(n/2);
13        long a = half[0];
14        long b = half[1];
15        long c = (a*((2*b%MOD-a+MOD)%MOD))%MOD;
16        long d= (a*a%MOD+b*b%MOD)%MOD;
17        if(n%2==0){
18            return new long[]{c,d};
19        }
20        else{
21            return new long[]{d,(c+d)%MOD};
22        }
23    }
24}