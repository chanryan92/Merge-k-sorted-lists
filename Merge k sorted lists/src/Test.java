
public class Test {
	public static void main(String[] args) {
		
		// Create testcase
		ListNode[] test = new ListNode[3];
		test[0] = new ListNode(1);
		test[0].next = new ListNode(4);
		test[0].next.next = new ListNode(10);
		
		test[1] = new ListNode(1);
		test[1].next = new ListNode(2);
		test[1].next.next = new ListNode(3);
		test[1].next.next.next = new ListNode(7);
		
		test[2] = new ListNode(7);
		test[2].next = new ListNode(8);
		test[2].next.next = new ListNode(23);
		
		// Create solution object to run mergeKLists method
		Solution solution = new Solution();
		ListNode result = solution.mergeKLists(test);
		
		// Display result
		while (result!=null) {
			System.out.print(result.val + " -> ");
			result = result.next;
		}
		System.out.print(result);
	}
}
