package week2.day1.assignments;

public class CharOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray(); //convert string into character array
		int length = charArray.length;
		for (int i = 0; i < length; i++) {
			if (charArray[i] == 'e') //verify if the character equals e
				count++; // if character has e then increment the count variable
		}

		System.out.println("Number of occurence of e is" + " " + count);
	}

}
