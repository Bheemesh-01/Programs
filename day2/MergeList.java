package day2;

class ListNode {
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

public class MergeList {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		current.next = list1 == null ? list2 : list1;
		return dummy.next;
	}
	public static void main(String[] args) {
		ListNode l1=null;
		ListNode l2=null;
		mergeTwoLists(l1,l2);
	}
}
