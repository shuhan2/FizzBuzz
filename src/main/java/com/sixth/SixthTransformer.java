package com.sixth;

import java.util.Arrays;
import java.util.List;

public class SixthTransformer {

  private List<Rule> rules = Arrays.asList(
      new ContainsSevenRule(),
      new ContainsFiveNotSevenRule(),
      new ContainsThreeNotFiveRule()
  );

  public String fizzBuzz(int number) {
    return rules.stream()
        .filter(rule -> rule.isMatchRule(number))
        .findFirst()
        .orElse(new DefaultRule())
        .getReturnForRules(number);
  }
}
