/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        // 经典解法： Stack后进先出，LIFO
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int[] array = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            array[index++] = stack.pop().val;
            // index需要自加操作
            // index++;
        }
        return array;
    }
}
