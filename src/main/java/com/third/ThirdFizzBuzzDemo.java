package com.third;

import static com.third.ThirdZz.*;

public class ThirdFizzBuzzDemo {

  private static final String EMPTY_STRING = "";

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = getReturnForSpecialNumber(number, FIZZ) +
        getReturnForSpecialNumber(number, BUZZ) +
        getReturnForSpecialNumber(number, WHIZZ);

    if (isContainsSpecialZzNumber(number, WHIZZ.getNumber())) {
      if (isContainsSpecialZzNumber(number, FIZZ.getNumber())) {
        return FIZZ.getReturnValue();
      }
      return returnForSpecialNumbers.replace(BUZZ.getReturnValue(), EMPTY_STRING);
    }
    if (isContainsSpecialZzNumber(number, BUZZ.getNumber())) {
      returnForSpecialNumbers = returnForSpecialNumbers.replace(FIZZ.getReturnValue(), EMPTY_STRING);
      return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
    }
    if (isContainsSpecialZzNumber(number, FIZZ.getNumber())) {
      return FIZZ.getReturnValue();
    }
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private boolean isContainsSpecialZzNumber(int number, int specialNumber) {
    return String.valueOf(number).contains(String.valueOf(specialNumber));
  }

  private String getReturnForSpecialNumber(int number, ThirdZz zz) {
    if (number % zz.getNumber() == 0) {
      return zz.getReturnValue();
    }
    return EMPTY_STRING;
  }
}
