package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import solution.ListNode;
import solution.Solution;

class Test1 {

	@Test
	void test() {
		Solution test = new Solution();
		
		// Create testcase input
		ListNode[] lists = new ListNode[3];

		lists[0] = new ListNode(1);
		ListNode curr = lists[0];
		curr.next(new ListNode(4));
		curr = curr.next();
		curr.next(new ListNode(5));
		
		lists[1] = new ListNode(1);
		curr = lists[1];
		curr.next(new ListNode(3));
		curr = curr.next();
		curr.next(new ListNode(4));
		
		lists[2] = new ListNode(2);
		lists[2].next(new ListNode(6));
		
		// Create solution object to run mergeKLists method
		Solution solution = new Solution();
		ListNode result = solution.mergeKLists(lists);
		
		// Convert solution to a list of number
		List<Integer> solutionList = new LinkedList();
		while (result!=null) {
			solutionList.add(result.getVal());
			result = result.next();
		}
		
		// Create expected result
		List<Integer> expected = Arrays.asList(1,1,2,3,4,4,5,6);
		
		// Check if it is the correct result
		assertEquals(solutionList, expected);
	}

}
