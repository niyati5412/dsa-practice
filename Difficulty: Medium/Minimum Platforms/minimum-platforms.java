import java.util.*;

class Solution {
    public int minPlatform(int arr[], int dep[]) {

        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0;
        int j = 0;
        int platforms = 0;
        int maxPlatforms = 0;

        while (i < arr.length) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
            } else {
                platforms--;
                j++;
            }
        }

        return maxPlatforms;
    }
}