package com;

public class FizzBuzzDemo {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String WHIZZ = "Whizz";

  public String fizzBuzz(int number) {
    if (isContainsTargetNumber(number, 5)) {
      if (isTheMultipleOfTargetNumber(number, 5)) {
        if (isTheMultipleOfTargetNumber(number, 7)) {
          return BUZZ + WHIZZ;
        }
        return BUZZ;
      }
    }
    if (isContainsTargetNumber(number, 3)) {
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

  private boolean isContainsTargetNumber(int originalNumber, int targetNumber) {
    return String.valueOf(originalNumber).contains(String.valueOf(targetNumber));
  }

  private boolean isTheMultipleOfTargetNumber(int originalNumber, int targetNumber) {
    return originalNumber % targetNumber == 0;
  }
}
