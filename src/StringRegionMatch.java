public class StringRegionMatch {
   public static void main(String[] args) {
      String first_str = "Welcome to Full creative";
      String second_str = "I work with Full creative";
      boolean match = first_str.regionMatches(11, second_str, 12, 13);
      System.out.println("first_str[11 -24] == " + "second_str[12 - 26]: "+ match);
   }
}