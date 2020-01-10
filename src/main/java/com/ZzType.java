package com;

public enum ZzType {
  FIZZ(3, "Fizz"),
  BUZZ(5, "Buzz"),
  WHIZZ(7, "Whizz");

  private final int number;
  private final String string;

  public int getNumber() {
    return number;
  }

  public String getString() {
    return string;
  }

  ZzType(int number, String string) {
   this.number = number;
   this.string = string;
  }
}
