package com.sixth;

public class ContainsFiveRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("5");
  }

  @Override
  public String getReturnForRules(int number) {
    String returnForSpecialNumbers =  SixthZz.BUZZ.parse(number) + SixthZz.WHIZZ.parse(number);
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }
}
