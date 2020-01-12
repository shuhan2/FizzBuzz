package com.seventh;

public class ContainsThreeNotFiveRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("3");
  }

  @Override
  public String getReturnForRule(int number) {
    return "Fizz";
  }
}
