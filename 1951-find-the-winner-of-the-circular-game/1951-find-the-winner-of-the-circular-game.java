import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int count = 0;
        int i = 0;
        while (list.size() > 1) {
            count++;
            if (count == k) {
                list.remove(i);
                count = 0;
                // Adjust index only if the current index is not at the end of the list
                if (i == list.size()) {
                    i = 0;
                }
            } else {
                i = (i + 1) % list.size();
            }
        }
        return list.get(0);
    }
}
