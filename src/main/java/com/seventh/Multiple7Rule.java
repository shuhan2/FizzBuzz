package com.seventh;

public class Multiple7Rule implements Rule {


  @Override
  public boolean isMatchRule(int number) {
    return number % 7 == 0;
  }

  @Override
  public String getReturnForRule(int number) {
    return SeventhZz.WHIZZ.parse(number);
  }
}
