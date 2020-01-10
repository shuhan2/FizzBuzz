package com.fourth;

public class FourthFizzBuzzDemo {

  public String fizzBuzz(int number) {
    if (number % 3 == 0) {
      if (number % 5 == 0) {
        return "FizzBuzz";
      }
      return "Fizz";
    }
    if (number % 5 == 0) {
      return "Buzz";
    }

    if (number % 7 == 0) {
      return "Whizz";
    }
    return String.valueOf(number);
  }
}
