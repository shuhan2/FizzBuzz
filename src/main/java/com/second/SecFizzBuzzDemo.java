package com.second;

import static com.second.ZzType.BUZZ;
import static com.second.ZzType.FIZZ;
import static com.second.ZzType.WHIZZ;

public class SecFizzBuzzDemo {

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = getReturnForSpecialNumber(number, FIZZ) +
        getReturnForSpecialNumber(number, BUZZ) +
        getReturnForSpecialNumber(number, WHIZZ);

    if (isContainsSpecialNumber(number, WHIZZ.getNumber())) {
      return returnForSpecialNumbers.replace(BUZZ.getString(), "");
    }
    if (isContainsSpecialNumber(number, BUZZ.getNumber())) {
      return returnForSpecialNumbers.replace(FIZZ.getString(), "");
    }
    if (isContainsSpecialNumber(number, FIZZ.getNumber())) {
      return FIZZ.getString();
    }
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private boolean isContainsSpecialNumber(int number, int specialNumber ) {
    return String.valueOf(number).contains(String.valueOf(specialNumber));
  }

  private String getReturnForSpecialNumber(int number, ZzType zzType) {
    if (number % zzType.getNumber() == 0) {
      return zzType.getString();
    }
    return "";
  }

}
