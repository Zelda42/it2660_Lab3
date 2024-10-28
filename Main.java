public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    // part 1 assign value to bestCase 
    String bestCase = "A"; //A because it is at index0 - Jennifer Kaliszewski(Zelda42)

    // * Initialize startTime here
    long startTime = System.nanoTime();
    int index = match(text, bestCase);
    // * Initialize endTime here
    long endTime = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTime = endTime - startTime;
    
    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");

    // part 5 output elapasedtime for bestcase
    System.out.println("Elapsed time for best case: " + elapsedTime + " nanoseconds");

    // part 2 assign value to worstCase
    String worstCase = "ZZZ"; // ZZZ because it does not exist must check all of string
    
    // * Initialize startTime here
    startTime = System.nanoTime();
    index = match(text, worstCase);
    // * Initialize endTime here
    endTime = System.nanoTime();
    // * Calculate elapsedTime here
    elapsedTime = endTime - startTime;
    
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");

    // part 5 output elapsedtime for worstcase
    System.out.println("Elapsed time for worst case: " + elapsedTime + " nanoseconds");  
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}