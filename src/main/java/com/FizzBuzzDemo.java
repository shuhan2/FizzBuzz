package com;

public class FizzBuzzDemo {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String WHIZZ = "Whizz";

  public String fizzBuzz(int number) {
    if (String.valueOf(number).contains("3")) {
      return FIZZ;
    }
    if (isTheMultipleOfTargetNumber(number, 3)) {
      if (isTheMultipleOfTargetNumber(number, 7)) {
        return FIZZ + WHIZZ;
      }
      if (isTheMultipleOfTargetNumber(number, 5)) {
        return FIZZ + BUZZ;
      }
      return FIZZ;
    }
    if (isTheMultipleOfTargetNumber(number, 5)) {
      return BUZZ;
    }
    if (isTheMultipleOfTargetNumber(number, 7)) {
      return WHIZZ;
    }
    return String.valueOf(number);
  }

  private boolean isTheMultipleOfTargetNumber(int number, int targetNumber) {
    return number % targetNumber == 0;
  }
}
