public class string_handling {
  public static void main(String[] args) {
    String str = "Hello, world!";
    
    // Get the length of the string
    int length = str.length();
    System.out.println("Length of the string: " + length);
    
    // Convert the string to uppercase
    String upper = str.toUpperCase();
    System.out.println("Uppercase string: " + upper);
    
    // Replace a substring in the string
    String replaced = str.replace("world", "Java");
    System.out.println("Replaced string: " + replaced);
    
    // Extract a substring from the string
    String sub = str.substring(7, 12);
    System.out.println("Substring: " + sub);
  }
}
