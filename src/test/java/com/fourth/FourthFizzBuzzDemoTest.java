package com.fourth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourthFizzBuzzDemoTest {

  @Test
  void should_return_2_when_fizzBuzz_given_2() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(2);
    assertEquals("2", actualResult);
  }
}