package leetcode;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int... a) {
        if (a.length < 1)
            return;
        this.val = a[0];
        ListNode p = this;
        for (int i = 1; i < a.length; i++) {
            p.next = new ListNode(a[i]);
            p = p.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode p = this;
        while (p.next != null) {
            sb.append(p.val + "->");
            p = p.next;
        }
        sb.append(p.val);
        return sb.toString();
    }
}