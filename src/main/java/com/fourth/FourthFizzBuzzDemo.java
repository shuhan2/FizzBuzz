package com.fourth;

import static com.fourth.FourthZz.BUZZ;
import static com.fourth.FourthZz.FIZZ;
import static com.fourth.FourthZz.WHIZZ;

public class FourthFizzBuzzDemo {

  private static final String EMPTY_STRING = "";

  public String fizzBuzz(int number) {
    String returnForSpecialZzs = EMPTY_STRING;
    for (FourthZz zz: new FourthZz[]{FIZZ, BUZZ, WHIZZ}) {
      if (number % zz.getNumber() == 0) {
        returnForSpecialZzs =  returnForSpecialZzs + zz.getReturnValue();
      }
    }
    if (String.valueOf(number).contains("7")) {
      return getReplacedReturn(number, returnForSpecialZzs, BUZZ);
    }
    if (String.valueOf(number).contains("5")) {
      return getReplacedReturn(number, returnForSpecialZzs, FIZZ);
    }
    if (String.valueOf(number).contains("3")) {
      return FIZZ.getReturnValue();
    }

    return returnForSpecialZzs.isEmpty() ? String.valueOf(number) : returnForSpecialZzs;
  }

  private String getReplacedReturn(int number, String returnForSpecialZzs, FourthZz buzz) {
    returnForSpecialZzs = returnForSpecialZzs.replace(buzz.getReturnValue(), EMPTY_STRING);
    return returnForSpecialZzs.isEmpty() ? String.valueOf(number) : returnForSpecialZzs;
  }

}
