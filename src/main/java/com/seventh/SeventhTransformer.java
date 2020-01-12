package com.seventh;

import java.util.Arrays;
import java.util.List;

public class SeventhTransformer {

  public String fizzBuzz(int number) {
    List<Rule> rules = Arrays.asList(
        new ContainsSevenRule(),
        new ContainsFiveNotSevenRule(),
        new ContainsThreeNotFiveRule()
    );

    return rules.stream()
        .filter(rule -> rule.isMatchRule(number))
        .findFirst()
        .orElse(new DefaultRule())
        .getReturnForRule(number);
  }
}
