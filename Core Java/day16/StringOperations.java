package com.day16;

public class StringOperations {
	public static String extractMiddleSubstring(String str1, String str2, int substringLength) {
		if(str1.length()==0|| str2.length() ==0|| substringLength > (str1.length() + str2.length())) {
			return "Invalid input";
		}
		String concatenated = str1 + str2;
		StringBuilder reversed = new StringBuilder(concatenated).reverse();
		String reversedString = reversed.toString();
		int startIndex=(concatenated.length() - substringLength)/2;
		int endIndex = startIndex + substringLength;
		if(startIndex <0 || endIndex>concatenated.length()) {
			return"Substring length is larger than the concatenated string";
		}
		return reversedString.substring(startIndex,endIndex);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extractMiddleSubstring("hello","world", 3));
		System.out.println(extractMiddleSubstring("","world", 3));
		System.out.println(extractMiddleSubstring("hello","", 3));
		System.out.println(extractMiddleSubstring("hello","world", 10));

	}

}
