package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzDemoTest {

  @Test
  void should_return_1_when_fizz_buzz_given_number_is_1() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(1);
    assertEquals("1", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizz_buzz_given_number_is__multiple_of_3() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(9);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_Buzz_when_fizz_buzz_given_number_is__multiple_of_5() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(10);
    assertEquals("Buzz", actualResult);
  }

  @Test
  void should_return_Whizz_when_fizz_buzz_given_number_is__multiple_of_7() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(14);
    assertEquals("Whizz", actualResult);
  }
}