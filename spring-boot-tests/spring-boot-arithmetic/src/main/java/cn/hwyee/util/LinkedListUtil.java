package cn.hwyee.util;

import cn.hwyee.domain.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hwyee@foxmail.com
 * @version 1.0
 * @ClassName LinkedListUtil
 * @description 链表操作
 * @date 2023/5/14
 * @since JDK 1.8
 */
public class LinkedListUtil {
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		ListNode listNode1 = ReverseList(listNode);
		System.out.println(listNode1.val + " " + listNode.next.val + " " + listNode1.next.next.val);
	}
	public static ListNode ReverseList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		List<Integer> list = new ArrayList<>();
		while (head.next != null) {
			list.add(head.val);
			head = head.next;
		}
		list.add(head.val);
		ListNode temp = new ListNode(list.get(list.size()-1));
		ListNode reverseHead = temp;
		for (int i = list.size()-2; i >=0; i--) {
			ListNode node = new ListNode(list.get(i));
			temp.next = node;
			temp = node;
		}
		return reverseHead;
	}
}
