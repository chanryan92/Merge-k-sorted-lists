# Merge-k-sorted-lists
**Version 1.0.0**

## Problem
<p>
  This is a solution for a algorithm problem, below is the description of the problem: <br />
  Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity. <br />
  Example: <br />
  Input: [1->4->5, 1->3->4, 2->6] <br />
  Output: [1->1->2->3->4->4->5->6] <br />
</p>

## Algorithm
<p>
  In this algorithm, we compare head of every linked list (input) with a heap and get the node with the smallest value. <br />
  Then, we extend the final sorted linked list with the selected nodes until there is only one linked list input left. <br />
  We can then extend the linked list left to get the final linked list. <br />
</p>

## Complexity Analysis
<p>
  - Time Complexity: <br />
    O(N logk) where N is the number of nodes in the final linked list and k is the number of linked lists. <br />
    The comparison cost of a heap is logk for every insertion and deletion. <br />
    This algorithm has worse case of inserting and deleting every nodes in the final linked list, thus, N times. <br />
    Finding node with smallest value using heap is O(1). <br />
  
  - Space Complexity: <br />
    Maximum of O(N) and O(k) where N is the number of nodes in the final linked list and k is the number of linked lists. <br />
    Note that we can apply an in-place method which improve the space complexity to O(k) space only. <br />
    <p/>

## Contributor
www.leetcode.com

## Reference
https://leetcode.com/problems/merge-k-sorted-lists/

## License & copyright
&copy; Ryan Chan
