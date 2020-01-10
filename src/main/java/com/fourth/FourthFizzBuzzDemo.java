package com.fourth;

import static com.fourth.FourthZz.BUZZ;
import static com.fourth.FourthZz.FIZZ;
import static com.fourth.FourthZz.WHIZZ;

public class FourthFizzBuzzDemo {

  public String fizzBuzz(int number) {
    String returnForSpecialZzs = "";
    for (FourthZz zz: new FourthZz[]{FIZZ, BUZZ, WHIZZ}) {
      if (number % zz.getNumber() == 0) {
        returnForSpecialZzs =  returnForSpecialZzs + zz.getReturnValue();
      }
    }
    return returnForSpecialZzs.isEmpty() ? String.valueOf(number) : returnForSpecialZzs;
  }

}
