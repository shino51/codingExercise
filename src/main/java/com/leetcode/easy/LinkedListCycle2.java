package com.leetcode.easy;

import com.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle2 {
  public ListNode detectCycle(ListNode head) {
    // slow pointer and fast pointer solution
    // fast pointer moves two

    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) break;
    }

    if (fast == null || fast.next == null) return null;

    fast = head;
    // when we find the cycle (i.e. slow and fast meets somewhere), then break the loop
    while (slow != fast) {
      if (fast == null || fast.next == null) return null;
      slow = slow.next;
      fast = fast.next.next;
    }

    // now move the slow pointer back to the head
    slow = head;

    // now we move both slow and fast pointer one step.
    // slow and fast meets at the beginning of the cycle
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return fast;
  }
}
