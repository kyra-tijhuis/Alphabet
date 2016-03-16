package letter;

public class CharacterPosition {
	

	public static void main(String... args) {
		CharacterPosition obj = new CharacterPosition();
		if (args.length==1 && args[0].length()==1) {
			String character = args[0].toLowerCase();
			char ch = character.charAt(0);
			if (Character.isLetter(ch)) {
				int position = ch - 'a';
				System.out.println(position);
			} else {
				System.out.println("Please enter a letter");
			}
		} else {
			System.out.println("Please enter one character");
		}
	}

}