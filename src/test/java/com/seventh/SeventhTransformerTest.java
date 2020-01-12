package com.seventh;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeventhTransformerTest {

  @ParameterizedTest
  @CsvSource({
      "'2', 2, 'should return original string value when fizzBuzz given no special number'",
      "'Fizz', 12, 'should return Fizz when fizzBuzz given only multiple 3'",
      "'Buzz', 20, 'should return Buzz when fizzBuzz given only multiple 5'",
      "'Whizz', 28, 'should return Whizz when fizzBuzz given only multiple 7'",
  })
  void should_return_expect_value_when_fizzBuzz_given_input_number(String output, int input) {
    String actualResult = new SeventhTransformer().fizzBuzz(input);
    assertEquals(output, actualResult);

  }
}