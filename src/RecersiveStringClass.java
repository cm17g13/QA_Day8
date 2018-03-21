
public class RecersiveStringClass {

	public static void main(String[] args) {
		System.out.println(recurciveMethod("hello"));
		System.out.println(recurciveMethod("aabb"));
		System.out.println(recurciveMethod("zzzz"));
		System.out.println(fact(5));
	}
	
	public static String recurciveMethod(String Word) {
		//if the word is 1 letter long, then return it.
		if(Word.length() == 1) {
			return Word;
		}
		//The first letter
		char currentLetter = Word.charAt(0);
		//The String of the remaining letters in the word
		String restOfWord = Word.substring(1);
		//check to see if the first letter is equal to the second letter
		if(currentLetter == Word.charAt(1)) {
			//builds up return statements that equate to Strings until the whole word is done
			return currentLetter + "-" + recurciveMethod(restOfWord);
			//eg. return currentLetter + "-" + (currentLetter + "-" + (currentLetter + "-" +(currentLetter))));
		} else {
			return currentLetter + recurciveMethod(restOfWord);
			//eg. return currentLetter + (currentLetter + (currentLetter +(currentLetter))));
		}
	}
	
	public static int fact(int i) {
		if(i == 1) {
			return 1;
		} else {
			return i * fact(i-1);
		}
	}
	//hello
	//l
	//lo
	//does l == l
	//return (a + "-" +(a + (b + "-" + (b))))
	//String hel-lo
}
