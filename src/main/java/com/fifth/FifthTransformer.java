package com.fifth;

import static com.fifth.FifthZz.*;

public class FifthTransformer {

  public String fizzBuzz(int number) {
    if (String.valueOf(number).contains("3")) {
      return "Fizz";
    }
    String returnForSpecialNumbers = getReturnForSpecialZz(number, FIZZ) +
        getReturnForSpecialZz(number, BUZZ) +
        getReturnForSpecialZz(number, WHIZZ);

    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private String getReturnForSpecialZz(int number, FifthZz zz) {
    if (number % zz.getNumber() == 0) {
      return zz.getReturnValue();
    }
    return "";
  }
}
