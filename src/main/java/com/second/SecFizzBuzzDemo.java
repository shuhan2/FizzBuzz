package com.second;

import static com.second.ZzType.BUZZ;
import static com.second.ZzType.FIZZ;
import static com.second.ZzType.WHIZZ;

public class SecFizzBuzzDemo {

  public String fizzBuzz(int number) {
    if (String.valueOf(number).contains("3")) {
      return FIZZ.getString();
    }
    String returnForSpecialNumbers = getReturnForSpecialNumber(number, FIZZ) +
        getReturnForSpecialNumber(number, BUZZ) +
        getReturnForSpecialNumber(number, WHIZZ);
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private String getReturnForSpecialNumber(int number, ZzType zzType) {
    if (number % zzType.getNumber() == 0) {
      return zzType.getString();
    }
    return "";
  }


}
