package week2.day1.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] ch = test.toCharArray(); //Convert String to Character Array
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) //If character is number then increment number count
				num++;
			else if (Character.isLetter(ch[i])) //If character is number then increment letter count
				letter++;
			else if (Character.isSpace(ch[i]))// If character has space in it then increment space count
				space++;
			else
				specialChar++; //If the character has special character then increment special character count
		}
		System.out.println("Number count" + " " + num);
		System.out.println("Letter count" + " " + letter);
		System.out.println("Space count" + " " + space);
		System.out.println("Special Character count" + " " + specialChar);
	}

}
