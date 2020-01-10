package com;

public class FizzBuzzDemo {

  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String WHIZZ = "Whizz";

  public String fizzBuzz(int number) {
    if (number % 3 == 0) {
      if (number % 7 == 0){
        return FIZZ + WHIZZ;
      }
      return FIZZ;
    }

    if (number % 5 == 0) {
      return BUZZ;
    }
    if (number % 7 == 0) {
      return WHIZZ;
    }
    return String.valueOf(number);
  }
}
