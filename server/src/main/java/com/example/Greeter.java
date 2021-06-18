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
  * Retourne le level du zéro.
  * @return Une instance de SDZLevel, qui correspond à niveau du membre sur SDZ.
  */
  public final String greet(final String someone) {
    return String.format("Hello stephane, %s!", someone);
  }
}
