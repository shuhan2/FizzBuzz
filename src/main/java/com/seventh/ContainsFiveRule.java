package com.seventh;

import static com.seventh.SeventhZz.BUZZ;
import static com.seventh.SeventhZz.WHIZZ;

public class ContainsFiveRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("5");
  }

  @Override
  public String getReturnForRule(int number) {
    String returnForRules = BUZZ.parse(number) + WHIZZ.parse(number);
    return returnForRules.isEmpty() ? String.valueOf(number) : returnForRules;
  }
}
