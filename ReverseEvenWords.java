package week2.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";

		String[] split = test.split(" "); // split the sentence into seperate words

		for (int i = 0; i < split.length; i++) {
			if (i % 2 == 1) { // to check of the index is even
				StringBuilder sb = new StringBuilder(split[i]);
				split[i] = sb.reverse().toString(); // to reverse even number of words
				System.out.println(split[i]);
			} else
				System.out.println(split[i]); // if index is odd then print the odd index words
		}
	}
}
