package com.third;

public class ThirdFizzBuzzDemo {

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = getReturnForSpecialNumber(number, ThirdZz.FIZZ) +
        getReturnForSpecialNumber(number, ThirdZz.BUZZ) +
        getReturnForSpecialNumber(number, ThirdZz.WHIZZ);
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }

  private String getReturnForSpecialNumber(int number, ThirdZz zz) {
    if (number % zz.getNumber() == 0) {
      return zz.getReturnValue();
    }
    return "";
  }

}
