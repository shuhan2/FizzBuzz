package com.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecFizzBuzzDemoTest {

  @Test
  void should_return_1_when_fizzbuzz_given_1() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(1);
    assertEquals("1", actualResult);
  }
}