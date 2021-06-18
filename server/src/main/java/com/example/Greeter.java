package com.example;

/**
* Retourne le level du zéro.
*/
public class Greeter {

/**
  * Retourne le level du zéro.
  */
  public Greeter() {

  }

/**
  * @return String.
  * @param someone
  * variable someone.
  */
  public final String greet(final String someone) {
    return String.format("Hello stephane, %s!", someone);
  }
}
