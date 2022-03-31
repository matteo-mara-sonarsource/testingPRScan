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

  private static final String STRING_3 = "String3";

  public static void main(String[] args) {

    if (DEPRECATED_STRING_1.equals("deprecatedString1")
      && STRING_3.equals("Strin4")
      && DEPRECATED_STRING_2.equals("deprecatedString2")) {
      System.out.println("All Strings are deprecated!");
    }

    if (DEPRECATED_STRING_2.equals("deprecatedString2")) {
      System.out.println("Another error incoming!");
    }

  }
}
