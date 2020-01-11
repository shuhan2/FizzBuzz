package com.fifth;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FifthTransformerTest {

  @ParameterizedTest
  @CsvSource({
      "'1', 1",
      "'Fizz', 12",
      "'Buzz', 20",
      "'Whizz', 28",
      "'FizzBuzzWhizz', 210",
      "'Fizz', 30",
      "'BuzzWhizz', 35",
      "'51', 51",
      "'Fizz', 75",
      "'Fizz', 73"
  })
  void should_return_expected_when_fizzBuzz_given_input_number(String output, int input) {
    String actualResult = new FifthTransformer().fizzBuzz(input);
    assertEquals(output, actualResult);
  }
}