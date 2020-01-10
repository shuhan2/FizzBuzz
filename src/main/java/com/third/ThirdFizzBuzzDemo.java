package com.third;

public class ThirdFizzBuzzDemo {

  public String fizzBuzz(int number) {
    String returnForSpecialNumbers = "";
    if (number % 3 == 0) {
      returnForSpecialNumbers = returnForSpecialNumbers + "Fizz";
    }
    if (number % 5 == 0) {
      returnForSpecialNumbers = returnForSpecialNumbers + "Buzz";
    }
    if (number % 7 == 0) {
      return "Whizz";
    }
    return returnForSpecialNumbers.isEmpty() ? String.valueOf(number) : returnForSpecialNumbers;
  }
}
