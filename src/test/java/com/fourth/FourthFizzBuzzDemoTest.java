package com.fourth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourthFizzBuzzDemoTest {

  @Test
  void should_return_2_when_fizzBuzz_given_2() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(2);
    assertEquals("2", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_6() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(6);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_Buzz_when_fizzBuzz_given_10() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(10);
    assertEquals("Buzz", actualResult);
  }
}