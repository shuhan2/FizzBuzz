package com.seventh;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeventhTransformerTest {

  @ParameterizedTest
  @CsvSource("'2'， 2，'should return original string value when fizzBuzz given no special number'")
  void should_return_expect_value_when_fizzBuzz_given_input_number() {
    String actualResult = new SeventhTransformer().fizzBuzz(1);
    assertEquals("1", actualResult);

  }
}