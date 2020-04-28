package solution;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    	// Return null for empty lists
        if (lists.length == 0) return null;
        
        // Create a heap in ascending order of node's value
        PriorityQueue<ListNode> heap = new PriorityQueue<>(lists.length, new Comparator<ListNode>(){
            public int compare(ListNode a, ListNode b){
                return a.val - b.val;
            }
        });
        
        // Insert every nodes from lists
        for (ListNode node: lists){
            if (node != null)
                heap.add(node);
        }
        
        // Create a dummy for final linked list where next node of dummy is the head of final linked list.
        // Get the node with the smallest value from heap created and extend final list until there is one node left.
        // Extend final list with the last one.
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (heap.size()>1){
            curr.next = heap.poll();
            curr = curr.next;                
            if (curr.next!=null)
                heap.add(curr.next);
        }
        curr.next = heap.poll();
        return dummy.next;
    }
}
