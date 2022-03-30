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

  public static void main(String[] args) {

    if (DEPRECATED_STRING_1.equals("deprecatedString1")
      && DEPRECATED_STRING_2.equals("deprecatedString2")) {

      for (int i = 0; i <10 ; i++) {
        printMessage("message n^" + i);
      }

      for (int i = 0; i <10 ; i++) {
        printMessage("message n^" + i);
      }

      for (int i = 0; i <10 ; i++) {
        printMessage("message n^" + i);
      }

      for (int i = 0; i <10 ; i++) {
        printMessage("message n^" + i);
      }

    }

  }

  private static void printMessage(String message) {
    System.out.println("Hey this is the new message: " + message);
  }

}
