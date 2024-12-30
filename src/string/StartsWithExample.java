package string;

public class StartsWithExample {

	public static void main(String[] args) {
		String institution = "Techcanvass";
		System.out.println("Does the institution start with Tech: " + institution.startsWith("Tech"));
		System.out.println("Does the institution start with canvass from 5th letter: " + institution.startsWith("canvass", 4));
		System.out.println("Does the institution ends with Tech: " + institution.endsWith("tech"));
		System.out.println("Does the institution ends with canvass: " + institution.endsWith("canvass"));
	}

}

