/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = new HashSet<>(); // Use a set for O(1) lookups
        for (int num : nums) {
            numSet.add(num); // Add all elements of nums to the set
        }
        
        ListNode dummy = new ListNode(0); // Create a dummy node
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
        
        // Traverse the list once
        while (curr != null) {
            if (numSet.contains(curr.val)) { // Check if the current value is in the set
                prev.next = curr.next; // Remove the node
            } else {
                prev = curr; // Move prev to curr if no deletion is done
            }
            curr = curr.next; // Move curr to the next node
        }
        
        return dummy.next; // Return the modified list starting at dummy.next
    }
}
