package com.third;

import static com.third.ThirdZz.*;

public class ThirdFizzBuzzDemo {

  private static final String EMPTY_STRING = "";

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = getReturnForSpecialNumber(number, FIZZ) +
        getReturnForSpecialNumber(number, BUZZ) +
        getReturnForSpecialNumber(number, WHIZZ);
    if (String.valueOf(number).contains("5")) {
      returnForSpecialNumbers = returnForSpecialNumbers.replace(FIZZ.getReturnValue(), EMPTY_STRING);
      return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
    }
    if (String.valueOf(number).contains("3")) {
      return FIZZ.getReturnValue();
    }

    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private String getReturnForSpecialNumber(int number, ThirdZz zz) {
    if (number % zz.getNumber() == 0) {
      return zz.getReturnValue();
    }
    return EMPTY_STRING;
  }
}
