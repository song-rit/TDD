package sut.ac.th;

public class Palindrome {
	
	String checkPalindrom(String str){
		
		StringBuffer buffer = new StringBuffer("");
		buffer.append(str);
		buffer.reverse();		
		return buffer.toString();
	}
}
