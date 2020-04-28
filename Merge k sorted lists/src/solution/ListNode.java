package solution;
public class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) { val = x; }
	public int getVal() {
		return val;
	}
	public ListNode next() {
		return next;
	}
	public void next(ListNode node) {
		this.next = node;
	}
}