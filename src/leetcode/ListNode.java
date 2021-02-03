package leetcode;

/**
 * 链表元素
 *
 * @author xiaohei
 * @date 2020年 08月02日 15:58:57
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
