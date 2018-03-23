
public class StringChecker {

	public static void main(String[] args) {
		String input = "beabeefeab";
		System.out.println(alphabetCheck(input));

	}
	
	public static String alphabetCheck(String input) {
		
		//char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] alphabet = getAlphabet(input);
		
		int alternateLength = 0;
		String output = "";
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				char c1 = alphabet[i];
				char c2 = alphabet[j];
				if(c1 == c2) {
					continue;
				}
				if(input.indexOf(c1) < input.indexOf(c2)) {
					String test = getString(alphabet, input, c1, c2);
					if(test.length() > alternateLength) {
							alternateLength = test.length();
							output = test;
					}
				}
				else {
					continue;
				}
			}
		}
		return output;
	}
	
	public static String getString(char[] alphabet, String input, char c1, char c2) {
		String newInput = input;
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == c1 || alphabet[i] == c2) {
				continue;
			}
			newInput = newInput.replace(Character.toString(alphabet[i]), "");
		}
		String check = "";
		for(int j = 0; j < newInput.length(); j ++) {
			if((j % 2) == 0) {
				check = check + Character.toString(c1);
			} else {
				check = check + Character.toString(c2);
			}
		}
		if(newInput.equals(check)) {
			return check;
		}
		return "";
		
	}
	
	public static char[] getAlphabet(String input) {
		String letters = "";
		for(char currentChar : input.toCharArray()) {
			if(letters.indexOf(currentChar) == -1) {
				letters = letters + Character.toString(currentChar);
			}
		}
		return letters.toCharArray();
	}

}
