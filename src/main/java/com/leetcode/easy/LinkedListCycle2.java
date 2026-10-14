package com.leetcode.easy;

import com.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle2 {
  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return null;
    }
    List<ListNode> list = new ArrayList<>();
    ListNode firstNodeOnCycle = detectCycle(head, list);
    return firstNodeOnCycle;
  }

  private ListNode detectCycle(ListNode current, List<ListNode> list) {
    if (list.contains(current)) {
      return current;
    }
    if (current.next == null) {
      return null;
    }
    list.add(current);

    return detectCycle(current.next, list);
  }
}
