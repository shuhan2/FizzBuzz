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

  @Test
  void should_return_Whizz_when_fizzBuzz_given_14() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(14);
    assertEquals("Whizz", actualResult);
  }

  @Test
  void should_return_FizzBuzz_when_fizzBuzz_given_60() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(60);
    assertEquals("FizzBuzz", actualResult);
  }

  @Test
  void should_return_FizzWhizz_when_fizzBuzz_given_42() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(42);
    assertEquals("FizzWhizz", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_13() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(13);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_BuzzWhizz_when_fizzBuzz_given_35() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(35);
    assertEquals("BuzzWhizz", actualResult);
  }

  @Test
  void should_return_51_when_fizzBuzz_given_51() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(51);
    assertEquals("51", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_75() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(75);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizzBuzz_given_73() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(73);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_74_when_fizzBuzz_given_74() {
    String actualResult = new ThirdFizzBuzzDemo().fizzBuzz(74);
    assertEquals("74", actualResult);
  }
}