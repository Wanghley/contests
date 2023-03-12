/**
 * @author Wanghley Soares Martins
 * Problem number: 206
 * Problem name: Reverse Linked List
 * Problem link: https://leetcode.com/problems/reverse-linked-list/
 */


class ReverseLinkedList{
    // Time Complexity: O(n)
    public ListNode reverseList(ListNode head) {
        ListNode rev = null;
        ListNode list = head;
        while (list!=null) {
            ListNode temp = list.next;
            list.next = rev;
            rev = list;
            list = temp;
        }
        return rev;
    }
}

/**
 * For demonstration purposes only
 * Compsci 201, Duke University, Fall 2022
 * @author Brandon Fain
 */
class ListNode {
    public String info;
    public ListNode next;
    public ListNode(String s) {
        info = s;
    }
    public ListNode(String s, ListNode next) {
        info = s;
        this.next = next;
    }
}
