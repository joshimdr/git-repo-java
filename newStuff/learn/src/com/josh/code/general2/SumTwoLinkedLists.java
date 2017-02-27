/**
 * 
 */
package com.josh.code.general2;

/**
 * @author munish
 *
 */
public class SumTwoLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[2,4,3]
			//	[5,6,4]
						
		ListNode l1 = new ListNode(2);
		ListNode l2 =new ListNode(4);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(5);
		ListNode l5=new ListNode(6);
		ListNode l6=new ListNode(4);
		
		l1.next=l2;
		l2.next=l3;
		 
		 l4.next=l5;
		 l5.next=l6;
		 
		 print(l1);
		 print(l4);
		 
		 ListNode l = addTwoNumbers(l1,l4);
		 print(l);
		 
		

	}
	
	private static void print(ListNode l) {
		// TODO Auto-generated method stub

		System.out.println();
		while(l!=null){
		
			System.out.print(l.val +"->");
			l = l.next;
		}
		
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode resulthead = null;
		ListNode currentPos = null;

		int carry = 0;
		int sum = 0;

		while (l1 != null && l2 != null) {

			if (carry > 0) {
				sum = l1.val + l2.val + carry;
			} else {
				sum = l1.val + l2.val;
			}
			if (sum > 9) {
				sum = sum % 10;
				carry = 1;
			}

			if (currentPos == null) {
				currentPos = new ListNode(sum);
				resulthead = currentPos;
			} else {
				currentPos.next = new ListNode(sum);
				currentPos = currentPos.next;
			}
			
			l1 = l1.next;
			l2 = l2.next;

		}
		while (l1 != null) {
			currentPos.next = new ListNode(l1.val);
			currentPos =currentPos.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			currentPos.next = new ListNode(l2.val);
			currentPos =currentPos.next;
			l2 = l2.next;
		}

		return resulthead;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
