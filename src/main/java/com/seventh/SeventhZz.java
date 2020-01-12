package com.seventh;

public enum SeventhZz {
  FIZZ(3, "Fizz"),
  BUZZ(5, "Buzz"),
  WHIZZ(7, "Whizz");

  private int targetNumber;
  private String returnValue;

  SeventhZz(int targetNumber, String returnValue) {
    this.targetNumber = targetNumber;
    this.returnValue = returnValue;
  }

  public String parse(int inputNumber) {
    return inputNumber % targetNumber == 0 ? returnValue : "";
  }
}
