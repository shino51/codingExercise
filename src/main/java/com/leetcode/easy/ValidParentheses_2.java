package com.leetcode.easy;

import java.util.*;

public class ValidParentheses_2 {
  public boolean isValid(String input) {
    if (input.length() % 2 != 0) {
      return false;
    }
    Map<Character, Character> brackets = new HashMap<>();
    brackets.put('(', ')');
    brackets.put('{', '}');
    brackets.put('[', ']');

    Stack<Character> openingBracket = new Stack<>();
    for(char bracket: input.toCharArray()) {
      Character closingBracket = brackets.get(bracket);
      if(closingBracket == null) {
        // expect opening bracket here. Check queue if anything stored
        if (openingBracket.isEmpty() || !brackets.get(openingBracket.peek()).equals(bracket)) {
          return false;
        }
        openingBracket.pop();
      } else {
        // expect opening bracket here. Put it on the queue
        openingBracket.add(bracket);
      }
    }
    return openingBracket.isEmpty();
  }
}
