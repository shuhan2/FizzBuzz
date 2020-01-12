package com.seventh;

import static com.seventh.SeventhZz.*;

public class ContainsThreeRule implements Rule {

  @Override
  public boolean isMatchRule(int number) {
    return String.valueOf(number).contains("3");
  }

  @Override
  public String getReturnForRule(int number) {
    return FIZZ.parse(number);
  }
}
