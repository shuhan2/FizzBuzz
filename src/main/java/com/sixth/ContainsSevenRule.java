package com.sixth;

public class ContainsSevenRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {

    return String.valueOf(number).contains("7");
  }

  @Override
  public String getReturnForRules(int number) {
    if (( String.valueOf(number).contains("3"))) {
      return "Fizz";
    }
    String returnForSpecialNumbers = SixthZz.FIZZ.parse(number) + SixthZz.WHIZZ.parse(number);
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }
}
