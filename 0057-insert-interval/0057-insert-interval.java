import java.util.LinkedList;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        LinkedList<int[]> ans = new LinkedList<>();
        boolean isMerged = false;

        for (int[] inter : intervals) {
            // Case 1: If the current interval is completely before the newInterval
            if (inter[1] < newInterval[0]) {
                ans.add(inter);
            }
            // Case 2: If the current interval is completely after the newInterval
            else if (inter[0] > newInterval[1]) {
                // If newInterval has not been added yet, add it before adding the current interval
                if (!isMerged) {
                    ans.add(newInterval);
                    isMerged = true;
                }
                ans.add(inter);
            }
            // Case 3: Overlap - merge the intervals
            else {
                newInterval[0] = Math.min(newInterval[0], inter[0]);
                newInterval[1] = Math.max(newInterval[1], inter[1]);
            }
        }

        // If the newInterval hasn't been merged, add it at the end
        if (!isMerged) {
            ans.add(newInterval);
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
