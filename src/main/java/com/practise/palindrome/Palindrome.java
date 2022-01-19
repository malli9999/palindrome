package com.practise.palindrome;

public class Palindrome 
{
	
/*Store the given number
 * given an empty to store the reverse of a given number 
 * compare given number and reverse number 
 * if true return palindrome
 * or non-palindrome number */
	
    public static void main( String[] args )
    {
      String orginal="121", revrse = "";
      
      int length = orginal.length();
      System.out.println(length);
      for (int i = length -1; i>= 0; i --) {
    	  revrse = revrse+ orginal.charAt(i);
      }
      System.out.println("reverse"+revrse);
      if (orginal.equals(revrse)) {
    	  System.out.println("provided input is palindrome");
      }
      else
    	  System.out.println("provided input is non-palindrome number");
          	
    }
}
