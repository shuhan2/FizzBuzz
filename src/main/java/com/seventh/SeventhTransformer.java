package com.seventh;

import java.util.Arrays;
import java.util.List;

public class SeventhTransformer {

  public String fizzBuzz(int number) {
    List<Rule> rules = Arrays.asList(new ContainsThreeNotFiveRule(), new ContainsFiveRule());
    return rules.stream()
        .filter(rule -> rule.isMatchRule(number))
        .findFirst()
        .orElse(new DefaultRule())
        .getReturnForRule(number);
  }
}
