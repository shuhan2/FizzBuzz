package com.third;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdFizzBuzzDemoTest {

  @Test
  void should_return_1_when_fizzBuzz_given_1() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(1);
    assertEquals("1", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_6() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(6);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_Buzz_when_fizzBuzz_given_10() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(10);
    assertEquals("Buzz", actualResult);
  }
}