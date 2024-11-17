// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode removeNodes(ListNode head) {
        // Use a stack to store the values in reverse order
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }

        // Start building the resulting linked list
        int max = st.pop();
        ListNode res = new ListNode(max);

        while (!st.isEmpty()) {
            int value = st.pop();
            if (value >= max) {
                max = value;
                ListNode newNode = new ListNode(max);
                newNode.next = res;
                res = newNode;
            }
        }

        return res;
    }
}
