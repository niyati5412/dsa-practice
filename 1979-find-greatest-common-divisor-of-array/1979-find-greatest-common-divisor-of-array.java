class Solution {
    
    public int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public int findGCD(int[] nums) {

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;

        for(int num : nums){
            mx = Math.max(mx,num);
            mn = Math.min(mn,num);
        }

        return gcd(mx,mn);
    }
}