package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";

		char[] charArray = null;
		char[] charArray2 = null;

		int count1 = text1.length();
		int count2 = text2.length();

		boolean flag = false;

		if (count1 == count2) {
			charArray = text1.toCharArray();// convert first String into char Array
			charArray2 = text2.toCharArray();//convert second string into char Array
			Arrays.sort(charArray);// Sort the array
			Arrays.sort(charArray2);//Sort the array
		}
		for (int i = 0; i < count1; i++) {
			if (charArray[i] == charArray2[i]) //compare if both the strings are equal
				flag = true;
		}
		if (flag = true)
			System.out.println("same");
		else
			System.out.println("not same");
	}
}
