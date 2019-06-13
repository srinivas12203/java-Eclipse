package com.virtusa.Jacoco_Demo.StringPalindrome;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
import org.junit.Test;
public class AppTest{

  String input1="noon";
  App app=new App();
  boolean expected=true;
  @Test
  public void isPalindromeTest() {
	  assertEquals(expected, app.isPalindrome(input1));
  }
}

