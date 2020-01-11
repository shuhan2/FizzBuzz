package com.sixth;

public class SixthTransformer {

  public String fizzBuzz(int number) {
    String returnForDefaultRules = SixthZz.FIZZ.parse(number) +
        SixthZz.BUZZ.parse(number) +
        SixthZz.WHIZZ.parse(number);

    if (String.valueOf(number).contains("5")) {
      return returnForDefaultRules;
    }
    if (String.valueOf(number).contains("3")) {
      return "Fizz";
    }

    return returnForDefaultRules.isEmpty() ? String.valueOf(number) : returnForDefaultRules;
  }
}
