package sut.ac.th;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	
	Palindrome palindrome = new Palindrome();
	
	@Test
	public void testOneString(){
		assertEquals("A", palindrome.checkPalindrom("A"));
	}
	
	@Test
	public void testTwoString(){
		assertEquals("AB", palindrome.checkPalindrom("AB"));
	}
	
	@Test
	public void testThreeString(){
		assertEquals("ABA", palindrome.checkPalindrom("ABA"));
	}
	
	@Test
	public void testThreeString2(){
		assertEquals("ABC", palindrome.checkPalindrom("ABC"));
	}

}
