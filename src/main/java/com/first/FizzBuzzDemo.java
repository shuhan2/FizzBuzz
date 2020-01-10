package com.first;

import static com.first.ZzType.BUZZ;
import static com.first.ZzType.FIZZ;
import static com.first.ZzType.WHIZZ;

public class FizzBuzzDemo {

  public String fizzBuzz(int number) {
    if (isContainsTargetNumber(number, WHIZZ.getNumber())) {
      return getReturnValueForTargetNumber(number, FIZZ) + getReturnValueForTargetNumber(number, WHIZZ);
    }
    if (isContainsTargetNumber(number, BUZZ.getNumber())) {
      String returnForSpecialNumber = getReturnValueForTargetNumber(number, BUZZ) + getReturnValueForTargetNumber(number, WHIZZ);
      return returnForSpecialNumber.isEmpty() ? String.valueOf(number) : returnForSpecialNumber;
    }
    if (isContainsTargetNumber(number, FIZZ.getNumber())) {
      return FIZZ.getString();
    }
    String returnForSpecialNumbers = getReturnValueForTargetNumber(number, FIZZ) +
        getReturnValueForTargetNumber(number, BUZZ) +
        getReturnValueForTargetNumber(number, WHIZZ);

    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number): returnForSpecialNumbers;
  }

  private String getReturnValueForTargetNumber(int number, ZzType zzType) {
    if (number % zzType.getNumber() == 0) {
      return zzType.getString();
    }
    return "";
  }

  private boolean isContainsTargetNumber(int originalNumber, int targetNumber) {
    return String.valueOf(originalNumber).contains(String.valueOf(targetNumber));
  }
}
