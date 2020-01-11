package com.sixth;

public class ContainsThreeNotFiveRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("3") && !String.valueOf(number).contains("5");
  }

  @Override
  public String getReturnForRules(int number) {
    return "Fizz";
  }
}
