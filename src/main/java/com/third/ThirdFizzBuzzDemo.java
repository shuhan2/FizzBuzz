package com.third;

public class ThirdFizzBuzzDemo {

  public String fizzBuzz(int number) {
    if (number % 3 == 0) {
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
