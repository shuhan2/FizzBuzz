package com.seventh;

public class Multiple3Rule implements Rule {


  @Override
  public boolean isMatchRule(int number) {
    return number % 3 == 0;
  }

  @Override
  public String getReturnForRule(int number) {
    return SeventhZz.FIZZ.parse(number);
  }
}
