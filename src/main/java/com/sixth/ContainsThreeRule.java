package com.sixth;

public class ContainsThreeRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("3");
  }

  @Override
  public String getReturnForRules(int number) {
    return "Fizz";
  }
}
