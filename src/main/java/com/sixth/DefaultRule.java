package com.sixth;

public class DefaultRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return number % 3 == 0 || number % 5 == 0 || number % 7 == 0;
  }

  @Override
  public String getReturnForRules(int number) {
    String returnForDefaultRules = SixthZz.FIZZ.parse(number) +
        SixthZz.BUZZ.parse(number) +
        SixthZz.WHIZZ.parse(number);
    return returnForDefaultRules.isEmpty() ? String.valueOf(number) : returnForDefaultRules;
  }
}
