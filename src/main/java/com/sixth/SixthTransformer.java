package com.sixth;

import java.util.Arrays;
import java.util.List;

public class SixthTransformer {
  List<Rule> rules = Arrays.asList(new ContainsFiveRule(),
                                   new ContainsThreeNotFiveRule(),
                                   new DefaultRule());

  public String fizzBuzz(int number) {
    return rules.stream()
        .filter(rule -> rule.isMatchRule(number))
        .findFirst().orElse(new DefaultRule())
        .getReturnForRules(number);
  }
}
