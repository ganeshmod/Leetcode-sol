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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Return the original list if there are less than 2 nodes
        }
        
        ListNode demo = new ListNode(0); // Dummy node to ease node swaps
        demo.next = head; // Point to the original head
        ListNode prev = demo; // Start with the dummy node

        // Loop as long as there are pairs to swap
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next; // The first node of the pair
            ListNode second = prev.next.next; // The second node of the pair
            
            // Perform the swap
            first.next = second.next; // Point first to the node after the second
            second.next = first; // Point second to the first
            prev.next = second; // Connect the previous part to the new head of the pair

            // Move prev to the next pair
            prev = first;
        }

        return demo.next; // Return the new head of the swapped list
    }
}
