package com.company;

public class Main {

  /**
   * @deprecated (when, why, refactoring advice...)
   */
  @Deprecated(since = "1.0")
  private static final String DEPRECATED_STRING_1 = "deprecatedString1";

  /**
   * @deprecated (when, why, refactoring advice...)
   */
  @Deprecated(since = "1.0")
  private static final String DEPRECATED_STRING_4 = "deprecatedString4";

  public static void main(String[] args) {

    if (DEPRECATED_STRING_1.equals("deprecatedString1")
      && DEPRECATED_STRING_4.equals("deprecatedString4")) {
      System.out.println("All Strings are deprecated!");
    }

  }
}
