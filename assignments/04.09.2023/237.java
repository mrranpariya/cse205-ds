 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int temp = node.next.val;
        node.next.val = node.val;
        node.val = temp;

        node.next = node.next.next;
    }
}
