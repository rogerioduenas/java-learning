package module07.lesson59stringmanipulation;

public class StringManipulation {

  static void main() {
    String string = "abcde FGHIJ KLM nop QRST    ";

    stringLowerCase(string);
    stringUpperCase(string);
    stringTrim(string);
    stringSubstringFrom(string, 2);
    stringSubstringFromTo(string, 2, 9);
    stringReplace(string, "a", "A");
    stringReplaceSubstring(string, "abc", "ABC");
    stringIndexOf(string, "d");
    stringLastIndexOf(string, "n");
    stringSplit("Potato Apple Lemon", " ");
  }

  static void stringLowerCase(String str) {
    String modifiedString = str.toLowerCase();
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("toLowerCase: -%s- %n", modifiedString);
  }

  static void stringUpperCase(String str) {
    String modifiedString = str.toUpperCase();
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("toUpperCase: -%s- %n", modifiedString);
  }

  static void stringTrim(String str) {
    String modifiedString = str.trim();
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("trimmed: -%s- %n", modifiedString);
  }

  static void stringSubstringFrom(String str, int indexFrom) {
    String modifiedString = str.substring(indexFrom);
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("subStringFrom: -%s- %n", modifiedString);
  }

  static void stringSubstringFromTo(String str, int start, int end) {
    String modifiedString = str.substring(start, end);
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("subStringFromTo: -%s- %n", modifiedString);
  }

  static void stringReplace(String str, String oldStr, String newStr) {
    String modifiedString = str.replace(oldStr, newStr);
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("replace: -%s- %n", modifiedString);
  }

  static void stringReplaceSubstring(String str, String oldStr, String newStr) {
    String modifiedString = str.replace(oldStr, newStr);
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("replaceSubstring: -%s- %n", modifiedString);
  }

  static void stringIndexOf(String str, String item) {
    int index = str.indexOf(item);
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("indexOf: -%s- %n", index);
  }

  static void stringLastIndexOf(String str, String item) {
    int lastIndex = str.lastIndexOf(item);
    System.out.printf("Original: -%s- %n", str);
    System.out.printf("lastIndex: -%s- %n", lastIndex);
  }

  static void stringSplit(String str, String delimiter) {
    String[] items = str.split(delimiter);
    System.out.printf("Original: -%s- %n", str);
    for (int i = 0; i < items.length; i++) {
      System.out.printf("split position %d: -%s- %n", i, items[i]);
    }
  }
}
