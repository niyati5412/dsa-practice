class Solution {
    static int cubeRoot(int n) {
        // code here
        int answer=0;
        for (int i=0;i*i*i<=n;i++){
            answer=i;
        }
        return answer;
        
    }
}