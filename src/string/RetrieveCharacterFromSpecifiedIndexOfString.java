package string;

public class RetrieveCharacterFromSpecifiedIndexOfString {
	
	String course = "Selenium Java Advanced Course";
	
	public void testRetrieveCharacterFromSpecifiedIndexOfString() {
		char fifthIndex = course.charAt(5);
		System.out.println("Sixth Letter of the String:" + "\t" + fifthIndex);
	}

	public static void main(String[] args) {
		RetrieveCharacterFromSpecifiedIndexOfString obj = new RetrieveCharacterFromSpecifiedIndexOfString();
		obj.testRetrieveCharacterFromSpecifiedIndexOfString();
	}
}
