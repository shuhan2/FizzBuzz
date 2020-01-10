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

  @Test
  void should_return_Whizz_when_fizzBuzz_given_14() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(14);
    assertEquals("Whizz", actualResult);
  }

  @Test
  void should_return_FizzBuzz_when_fizzBuzz_given_60() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(60);
    assertEquals("FizzBuzz", actualResult);
  }

  @Test
  void should_return_FizzWhizz_when_fizzBuzz_given_42() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(42);
    assertEquals("FizzWhizz", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_30() {
    String actualResult = new FourthFizzBuzzDemo().fizzBuzz(30);
    assertEquals("Fizz", actualResult);
  }
}