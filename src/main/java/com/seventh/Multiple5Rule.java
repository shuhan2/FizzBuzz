package com.seventh;

public class Multiple5Rule implements Rule {


  @Override
  public boolean isMatchRule(int number) {
    return number % 5 == 0;
  }

  @Override
  public String getReturnForRule(int number) {
    return SeventhZz.BUZZ.parse(number);
  }
}
