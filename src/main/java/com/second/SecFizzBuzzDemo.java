package com.second;

import static com.second.ZzType.BUZZ;
import static com.second.ZzType.FIZZ;
import static com.second.ZzType.WHIZZ;

public class SecFizzBuzzDemo {

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = getReturnForSpecialNumber(number, FIZZ) +
        getReturnForSpecialNumber(number, BUZZ) +
        getReturnForSpecialNumber(number, WHIZZ);

    String fizz = returnFizzIfContainsThree(number);
    if (isContainsSpecialNumber(number, WHIZZ.getNumber())) {
      return fizz.isEmpty()? returnForSpecialNumbers.replace(BUZZ.getString(), "") : fizz;
    }
    if (isContainsSpecialNumber(number, BUZZ.getNumber())) {
      return returnForSpecialNumbers.replace(FIZZ.getString(), "");
    }
    if (!fizz.isEmpty()) {
      return fizz;
    }
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;

  }

  private String returnFizzIfContainsThree(int number) {
    if (String.valueOf(number).contains(String.valueOf(FIZZ.getNumber()))) {
      return FIZZ.getString();
    }
    return "";
  }

  private boolean isContainsSpecialNumber(int number, int specialNumber) {
    return String.valueOf(number).contains(String.valueOf(specialNumber));
  }

  private String getReturnForSpecialNumber(int number, ZzType zzType) {
    if (number % zzType.getNumber() == 0) {
      return zzType.getString();
    }
    return "";
  }

}
