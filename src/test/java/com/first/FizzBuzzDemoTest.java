package com.first;

import com.first.FizzBuzzDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzDemoTest {

  @Test
  void should_return_1_when_fizz_buzz_given_number_is_1() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(1);
    assertEquals("1", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizz_buzz_given_number_is_9() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(9);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_Buzz_when_fizz_buzz_given_number_is_10() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(10);
    assertEquals("Buzz", actualResult);
  }

  @Test
  void should_return_Whizz_when_fizz_buzz_given_number_is_14() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(14);
    assertEquals("Whizz", actualResult);
  }

  @Test
  void should_return_FizzWhizz_when_fizz_buzz_given_number_is_21() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(21);
    assertEquals("FizzWhizz", actualResult);
  }

  @Test
  void should_return_FizzBuzz_when_fizz_buzz_given_number_is_60() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(60);
    assertEquals("FizzBuzz", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizz_buzz_given_number_is_30() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(30);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_Fizz_when_fizz_buzz_given_number_is_35() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(35);
    assertEquals("BuzzWhizz", actualResult);
  }

  @Test
  void should_return_51_when_fizz_buzz_given_number_is_75() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(75);
    assertEquals("Fizz", actualResult);
  }

  @Test
  void should_return_51_when_fizz_buzz_given_number_is_51() {
    String actualResult = new FizzBuzzDemo().fizzBuzz(51);
    assertEquals("51", actualResult);
  }

}