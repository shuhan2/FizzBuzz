package com.third;

import static com.third.ThirdZz.*;

public class ThirdFizzBuzzDemo {

  public String fizzBuzz(int number) {
    if (String.valueOf(number).contains("3")) {
      return FIZZ.getReturnValue();
    }
    String returnForSpecialNumbers = getReturnForSpecialNumber(number, FIZZ) +
        getReturnForSpecialNumber(number, BUZZ) +
        getReturnForSpecialNumber(number, WHIZZ);

    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private String getReturnForSpecialNumber(int number, ThirdZz zz) {
    if (number % zz.getNumber() == 0) {
      return zz.getReturnValue();
    }
    return "";
  }
}
