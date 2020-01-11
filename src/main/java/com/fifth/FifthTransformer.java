package com.fifth;

import static com.fifth.FifthZz.*;

public class FifthTransformer {

  private static final String EMPTY_STRING = "";

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = getReturnForSpecialZz(number, FIZZ) +
        getReturnForSpecialZz(number, BUZZ) +
        getReturnForSpecialZz(number, WHIZZ);
    if (String.valueOf(number).contains("5")) {
      returnForSpecialNumbers = returnForSpecialNumbers.replace("Fizz", EMPTY_STRING);
      return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
    }
    if (String.valueOf(number).contains("3")) {
      return "Fizz";
    }

    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private String getReturnForSpecialZz(int number, FifthZz zz) {
    if (number % zz.getNumber() == 0) {
      return zz.getReturnValue();
    }
    return EMPTY_STRING;
  }
}
