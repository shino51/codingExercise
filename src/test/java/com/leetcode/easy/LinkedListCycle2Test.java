package com.leetcode.easy;

import com.leetcode.medium.ReverseInteger;
import com.leetcode.utils.ListNode;
import org.junit.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class LinkedListCycle2Test {

  private final LinkedListCycle2 classUnderTest = new LinkedListCycle2();

  @Test
  public void test1() {
    ListNode root = new ListNode(3);
    ListNode first = new ListNode(2);
    ListNode second = new ListNode(0);
    ListNode third = new ListNode(-4);
    root.next = first;
    first.next = second;
    second.next = third;
    third.next = first;

    ListNode result = classUnderTest.detectCycle(root);
    assertThat(result).isEqualTo(first);
  }

  @Test
  public void test2() {
    ListNode root = new ListNode(1);
    ListNode first = new ListNode(2);
    root.next = first;
    first.next = root;

    ListNode result = classUnderTest.detectCycle(root);
    assertThat(result).isEqualTo(root);
  }


  @Test
  public void test3() {
    ListNode root = new ListNode(1);

    ListNode result = classUnderTest.detectCycle(root);
    assertThat(result).isEqualTo(null);
  }
}