package string;

import java.util.Scanner;

public class FindWordInSentence {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the word to search:" + "\t");
		String word = in.nextLine();
		
		System.out.println("Enter the sentence:" + "\t");
		String sentence = in.nextLine();
		
		if(sentence.contains(word)) {
			System.out.println("Yes, it contains the word");
		}
		else {
			System.out.println("You searched for " + word + "couldn't find in teh given sentence");
		}
		
	}

}
