class Solution {

    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        generate(s, 0, "", ans);
        Collections.sort(ans);
        return ans;
    }

    public void generate(String s, int index, String current,
                          List<String> ans) {
        if (index == s.length()) {
            ans.add(current);
            return;
        }
        generate(s, index + 1, current, ans);
        generate(s, index + 1,current + s.charAt(index), ans);
    }
}