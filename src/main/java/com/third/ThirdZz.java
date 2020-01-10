package com.third;

public enum ThirdZz {
  FIZZ(3, "Fizz"),
  BUZZ(5, "Buzz"),
  WHIZZ(7, "Whizz");

  private int number;
  private String returnValue;

  ThirdZz(int number, String returnValue) {
    this.number = number;
    this.returnValue = returnValue;
  }

  public int getNumber() {
    return number;
  }

  public String getReturnValue() {
    return returnValue;
  }
}
