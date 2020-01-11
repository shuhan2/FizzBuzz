package com.fifth;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FifthTransformerTest {

  @ParameterizedTest
  @CsvSource({
      "'1', 1, 'should return 1 when fizzBuzz given 1'",
      "'Fizz', 12, 'should return Fizz when fizzBuzz given 12'",
      "'Buzz', 20, 'should return Buzz when fizzBuzz given 20'",
      "'Whizz', 28, 'should return Whizz when fizzBuzz given 28'",
      "'FizzBuzzWhizz', 210, 'should return FizzBuzzWhizz when fizzBuzz given 210'",
      "'Fizz', 30, 'should return Fizz when fizzBuzz given 30'"
  })
  void should_return_expected_when_fizzBuzz_given_input_number(String output, int input) {
    String actualResult = new FifthTransformer().fizzBuzz(input);
    assertEquals(output, actualResult);
  }
}