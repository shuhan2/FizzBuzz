package com;

import static com.ZzType.BUZZ;
import static com.ZzType.FIZZ;
import static com.ZzType.WHIZZ;

public class FizzBuzzDemo {

  public String fizzBuzz(int number) {
    if (isContainsTargetNumber(number, WHIZZ.getNumber())) {
      return getReturnValueForTargetNumber(number, FIZZ) + getReturnValueForTargetNumber(number, WHIZZ);
    }
    if (isContainsTargetNumber(number, BUZZ.getNumber())) {
      if (!isTheMultipleOfAnyTargetNumber(number, BUZZ.getNumber(), WHIZZ.getNumber())) {
        return String.valueOf(number);
      }
      return getReturnValueForTargetNumber(number, BUZZ) + getReturnValueForTargetNumber(number, WHIZZ);
    }
    if (isContainsTargetNumber(number, FIZZ.getNumber())) {
      return FIZZ.getString();
    }
    if (isTheMultipleOfAnyTargetNumber(number, FIZZ.getNumber(), BUZZ.getNumber(), WHIZZ.getNumber())) {
      return getReturnValueForTargetNumber(number, FIZZ) +
          getReturnValueForTargetNumber(number, BUZZ) +
          getReturnValueForTargetNumber(number, WHIZZ);
    }
    return String.valueOf(number);
  }

  private String getReturnValueForTargetNumber(int number, ZzType zzType) {
    if (isTheMultipleOfTargetNumber(number, zzType.getNumber())) {
      return zzType.getString();
    }
    return "";
  }


  private boolean isContainsTargetNumber(int originalNumber, int targetNumber) {
    return String.valueOf(originalNumber).contains(String.valueOf(targetNumber));
  }

  private boolean isTheMultipleOfTargetNumber(int originalNumber, int targetNumber) {
    return originalNumber % targetNumber == 0;
  }

  private boolean isTheMultipleOfAnyTargetNumber(int originalNumber, int... targetNumbers) {
    for (int targetNumber: targetNumbers) {
      if (originalNumber % targetNumber == 0) {
        return true;
      }
    }
    return false;
  }
}
