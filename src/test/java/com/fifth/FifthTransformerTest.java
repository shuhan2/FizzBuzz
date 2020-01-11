package com.fifth;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FifthTransformerTest {


  @ParameterizedTest
  @CsvSource({
      "'1', 1, 'should return 1 when fizzBuzz given 1'",
      "'Fizz', 12, 'should return Fizz when fizzBuzz given 12'"
  })
  void should_return_expected_when_fizzBuzz_given_input_number(String output, int input) {
    String actualResult = new FifthTransformer().fizzBuzz(input);
    assertEquals(output, actualResult);
  }
}