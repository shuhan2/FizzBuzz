package com.seventh;

import java.util.Arrays;
import java.util.List;

import static com.seventh.SeventhZz.BUZZ;
import static com.seventh.SeventhZz.FIZZ;
import static com.seventh.SeventhZz.WHIZZ;

public class DefaultRule implements Rule {


  @Override
  public boolean isMatchRule(int number) {
    List<Rule> rules = Arrays.asList(new Multiple3Rule(),
                                     new Multiple5Rule(),
                                     new Multiple7Rule());
    return rules.stream().anyMatch(rule -> rule.isMatchRule(number));
  }

  @Override
  public String getReturnForRule(int number) {
    String returnForDefaultRules = FIZZ.parse(number) +
        BUZZ.parse(number) +
        WHIZZ.parse(number);
    return returnForDefaultRules.isEmpty() ? String.valueOf(number) : returnForDefaultRules;
  }
}
