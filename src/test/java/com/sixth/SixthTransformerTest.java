package com.sixth;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SixthTransformerTest {
  @ParameterizedTest
  @CsvSource({
      "'1', 1, 'should return original value when fizzBuzz given no special value'",
      "'Fizz', 12, 'should return original value when fizzBuzz given only match multiple 3 rule'",
      "'Buzz', 20, 'should return original value when fizzBuzz given only match multiple 5 rule'",
      "'Whizz', 28, 'should return original value when fizzBuzz given only match multiple 7 rule'",
      "'FizzBuzzWhizz', 210, 'should return original value when fizzBuzz given only match multiple 3, 5, 7 rule'"
  })
  void should_return_expected_when_fizzBuzz_given_input_number(String output, int input) {
    String actualResult = new SixthTransformer().fizzBuzz(input);
    assertEquals(output, actualResult);
  }

}