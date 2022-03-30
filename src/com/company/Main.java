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
  private static final String DEPRECATED_STRING_2 = "deprecatedString2";

  /**
   * @deprecated (when, why, refactoring advice...)
   */
  @Deprecated(since = "1.0")
  private static final String DEPRECATED_STRING_3 = "deprecatedString3";

  public static void main(String[] args) {

    if (DEPRECATED_STRING_1.equals("deprecatedString1")
      && DEPRECATED_STRING_2.equals("deprecatedString2")
      && DEPRECATED_STRING_3.equals("deprecatedString3")) {
      System.out.println("All Strings are deprecated!");
    }

  }
}
