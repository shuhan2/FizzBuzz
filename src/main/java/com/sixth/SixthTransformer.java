package com.sixth;

public class SixthTransformer {

  public String fizzBuzz(int number) {
    String returnForDefaultRules = SixthZz.FIZZ.parse(number) +
        SixthZz.BUZZ.parse(number) +
        SixthZz.WHIZZ.parse(number);

    return returnForDefaultRules.isEmpty() ? String.valueOf(number) : returnForDefaultRules;
  }
}
