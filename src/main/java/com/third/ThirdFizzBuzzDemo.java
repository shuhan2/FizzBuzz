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
      returnForSpecialNumbers = getReplace(returnForSpecialNumbers, BUZZ);
      return getReturnForOriginalOrSpecial(number, returnForSpecialNumbers);
    }
    if (isContainsSpecialZzNumber(number, BUZZ.getNumber())) {
      returnForSpecialNumbers = getReplace(returnForSpecialNumbers, FIZZ);
      return getReturnForOriginalOrSpecial(number, returnForSpecialNumbers);
    }
    if (isContainsSpecialZzNumber(number, FIZZ.getNumber())) {
      return FIZZ.getReturnValue();
    }
    return getReturnForOriginalOrSpecial(number, returnForSpecialNumbers);
  }

  private String getReplace(String returnForSpecialNumbers, ThirdZz fizz) {
    return returnForSpecialNumbers.replace(fizz.getReturnValue(), EMPTY_STRING);
  }

  private String getReturnForOriginalOrSpecial(int number, String returnForSpecialNumbers) {
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
