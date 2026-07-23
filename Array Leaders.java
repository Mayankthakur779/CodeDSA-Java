import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;

        int max = arr[n - 1];
        ans.add(max);

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                max = arr[i];
                ans.add(max);
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}
