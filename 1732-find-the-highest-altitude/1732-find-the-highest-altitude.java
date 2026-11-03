class Solution {
    public int largestAltitude(int[] gain) {
        int Alt=0;
        int maxAlt=0;
        for(int i=0;i<gain.length;i++){
            Alt=Alt+gain[i];
            maxAlt=Math.max(Alt,maxAlt);
        }
        return maxAlt;
    }
}