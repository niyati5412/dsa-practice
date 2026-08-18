class Solution {
    boolean fascinating(long n) {
        // code here
        String s= ""+n+(n*2)+(n*3);
        if(s.length()!=9){
            return false;
        }
        
        for(char c='1';c<='9';c++){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    count++;
                }
            }
            if(count!=1){
                return false;
            }
        }
        return true;
    }
}