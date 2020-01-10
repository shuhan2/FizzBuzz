package com.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecFizzBuzzDemoTest {

  @Test
  void should_return_1_when_fizzBuzz_given_1() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(1);
    assertEquals("1", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_6() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(6);
    assertEquals("Fizz", actualResult);

  }

  @Test
  void should_return_Buzz_when_fizzBuzz_given_10() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(10);
    assertEquals("Buzz", actualResult);
  }

  @Test
  void should_return_Whizz_when_fizzBuzz_given_14() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(14);
    assertEquals("Whizz", actualResult);
  }

  @Test
  void should_return_FizzBuzz_when_fizzBuzz_given_60() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(60);
    assertEquals("FizzBuzz", actualResult);
  }

  @Test
  void should_return_FizzWhizz_when_fizzBuzz_given_21() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(21);
    assertEquals("FizzWhizz", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_30() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(30);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_BuzzWhizz_when_fizzBuzz_given_35() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(35);
    assertEquals("BuzzWhizz", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_75() {
    String actualResult = new SecFizzBuzzDemo().fizzBuzz(75);
    assertEquals("Fizz", actualResult);
  }
}