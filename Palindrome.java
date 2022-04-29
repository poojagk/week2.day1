package week2.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Madam";
		String rev = "";

		int count = text.length();
		for (int i = count - 1; i >= 0; --i) {
			rev = rev + text.charAt(i); //Store the characters in reverse to get the reversed string value.
		}
		if (rev.equalsIgnoreCase(text)) //Compare reversed String with the original String value
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
