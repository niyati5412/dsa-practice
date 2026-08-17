class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                five++;
            }

            else if (bill == 10) {

                if (five == 0) {
                    return false;
                }

                five--;
                ten++;
            }

            else { // bill == 20

                if (ten > 0 && five > 0) {
                    // Greedy: 10 + 5 dena best hai
                    ten--;
                    five--;
                }

                else if (five >= 3) {
                    // 10 nahi hai, toh 5 + 5 + 5
                    five -= 3;
                }

                else {
                    return false;
                }
            }
        }

        return true;
    }
}