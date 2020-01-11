package com.sixth;

public class ContainsSevenRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {

    return String.valueOf(number).contains("7");
  }

  @Override
  public String getReturnForRules(int number) {
    String returnForSpecialNumbers = SixthZz.FIZZ.parse(number) + SixthZz.WHIZZ.parse(number);
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }
}
