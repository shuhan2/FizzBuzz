package com.fifth;

public class FifthTransformer {

  public String fizzBuzz(int number) {
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(number);
  }
}
