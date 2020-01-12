package com.seventh;

import static com.seventh.SeventhZz.BUZZ;
import static com.seventh.SeventhZz.FIZZ;
import static com.seventh.SeventhZz.WHIZZ;

public class ContainsSevenRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("7");
  }

  @Override
  public String getReturnForRule(int number) {
    if (new ContainsThreeNotFiveRule().isMatchRule(number)) {
      return new ContainsThreeNotFiveRule().getReturnForRule(number);
    }
    String returnForRules = FIZZ.parse(number) + WHIZZ.parse(number);
    return returnForRules.isEmpty() ? String.valueOf(number) : returnForRules;
  }
}
