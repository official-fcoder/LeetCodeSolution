package leetcodehard;
import java.util.*;
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}
class TreeNodeComparator implements Comparator<ListNode> {
	@Override 
	public int compare(ListNode o1,ListNode o2) {
		if(o1.val > o2.val) return 1;
		if(o1.val < o2.val) return -1;
		return 0;
	}
}
public class MergekSortedLinkedList_23 {
	
	 public ListNode mergeKLists(ListNode[] lists) {
		 int k = lists.length;
		 ListNode dummy = new ListNode();
		 ListNode curr = dummy;
		 PriorityQueue<ListNode> pq = new PriorityQueue<>(new TreeNodeComparator());
		 for(int i=0;i<k;i++) {
			 pq.add(lists[i]);
		 }
		 while(!pq.isEmpty()) {
			 ListNode newNode = pq.poll();
			 curr.next = newNode;
			 curr = curr.next;
			 if(newNode.next != null) pq.add(newNode.next);
		 }
		 return dummy.next;
	 }

	public static void main(String[] args) {
		
	}

}
