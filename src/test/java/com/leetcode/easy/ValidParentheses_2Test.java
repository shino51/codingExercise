package com.leetcode.easy;

import org.junit.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ValidParentheses_2Test {

  private final ValidParentheses_2 classUnderTest = new ValidParentheses_2();


    @ParameterizedTest
    @CsvSource({
      "(), true",
      "()[]{}, true",
      "(], false",
      "([]), true",
      "([)], false",
      ")(, false"
    })
    void testReverseInteger(String input, boolean expected) {
        assertThat(classUnderTest.isValid(input)).isEqualTo(expected);
    }
}