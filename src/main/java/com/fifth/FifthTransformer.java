package com.fifth;

import static com.fifth.FifthZz.*;

public class FifthTransformer {

  private static final String EMPTY_STRING = "";

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = getReturnForSpecialZz(number, FIZZ) +
        getReturnForSpecialZz(number, BUZZ) +
        getReturnForSpecialZz(number, WHIZZ);

    if (isContainsSpecialZzNumber(number, WHIZZ.getNumber())) {
      if (isContainsSpecialZzNumber(number, FIZZ.getNumber())) {
        return FIZZ.getReturnValue();
      }
      returnForSpecialNumbers = returnForSpecialNumbers.replace(BUZZ.getReturnValue(), EMPTY_STRING);
      return getReturnForSpecialOrOriginal(number, returnForSpecialNumbers);
    }
    if (isContainsSpecialZzNumber(number, BUZZ.getNumber())) {
      returnForSpecialNumbers = returnForSpecialNumbers.replace(FIZZ.getReturnValue(), EMPTY_STRING);
      return getReturnForSpecialOrOriginal(number, returnForSpecialNumbers);
    }
    if (isContainsSpecialZzNumber(number, FIZZ.getNumber())) {
      return FIZZ.getReturnValue();
    }

    return getReturnForSpecialOrOriginal(number, returnForSpecialNumbers);
  }

  private String getReturnForSpecialOrOriginal(int number, String returnForSpecialNumbers) {
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private boolean isContainsSpecialZzNumber(int number, int zzNumber) {
    return String.valueOf(number).contains(String.valueOf(zzNumber));
  }

  private String getReturnForSpecialZz(int number, FifthZz zz) {
    if (number % zz.getNumber() == 0) {
      return zz.getReturnValue();
    }
    return EMPTY_STRING;
  }
}
