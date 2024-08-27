/** This class is expected to be a singleton. Please make necessary changes. */
package com.apptware.interview.singleton;

import java.util.Objects;

public class Singleton {
  private static Singleton single_instance = null;

  public String s;

  private Singleton() {
    s = "Hello I am a string part of Singleton class";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Singleton singleton = (Singleton) o;
    return Objects.equals(s, singleton.s);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(s);
  }

  public static synchronized Singleton getInstance() {
    if (single_instance == null) single_instance = new Singleton();

    return single_instance;
  }
}
