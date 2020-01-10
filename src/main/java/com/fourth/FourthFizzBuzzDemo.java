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
    if (String.valueOf(number).contains("5")) {
      returnForSpecialZzs = returnForSpecialZzs.replace(FIZZ.getReturnValue(), EMPTY_STRING);
      return returnForSpecialZzs.isEmpty() ? String.valueOf(number) : returnForSpecialZzs;
    }
    if (String.valueOf(number).contains("3")) {
      return FIZZ.getReturnValue();
    }

    return returnForSpecialZzs.isEmpty() ? String.valueOf(number) : returnForSpecialZzs;
  }

}
