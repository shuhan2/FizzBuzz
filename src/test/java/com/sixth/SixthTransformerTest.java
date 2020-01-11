package com.sixth;

import com.fifth.FifthTransformer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SixthTransformerTest {
  @ParameterizedTest
  @CsvSource({
      "'1', 1, 'should return original value when fizzBuzz'"

  })
  void should_return_expected_when_fizzBuzz_given_input_number(String output, int input) {
    String actualResult = new SixthTransformer().fizzBuzz(input);
    assertEquals(output, actualResult);
  }

}