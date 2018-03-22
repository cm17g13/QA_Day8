package morseCode;
import java.util.*;

public class MorseConverter {

	static Scanner scanner = new Scanner(System.in);
	static HashMap<Character, String> englishToMorse;
	static HashMap<String, Character> morseToEnglish;
	
	public static void main(String[] args) {
		populateEnglish();
		populateMorse();
		boolean stop = false;
		do {
			System.out.println("Would you like to convert from \"Morse\" to a \"English\" or from a \"English\" to \"Morse\", or would you like to \"Stop\"");
			System.out.println("Please put what you would like to convert from: ");
			String input = scanner.nextLine().toLowerCase().trim();
			if(input.equals("morse")) {
				System.out.println("Please paste in your morse code");
				String morse = scanner.nextLine().trim();
				morseToString(morseToEnglish, morse);
			} else if(input.equals("english")) {
				System.out.println("Please paste in your text");
				String english = scanner.nextLine().toLowerCase().trim();
				stringToMorse(english);
			} else if(input.equals("stop")) {
				stop = true;
			} else {
				System.out.println("Please put either \"Morse\" or \"English\"");
			}
		}while(!stop);
	}
	
	public static void morseToString(HashMap<String,Character> morseToEnglish, String morse) {
		//converts the morse string to an array of words (Strings)
		String[] morseSplit = morse.split(" / ");
		//a for each loop that goes through each word, and splits it into an array letter
		for(String word : morseSplit) {
			String[] letters = word.split(" ");
			for(String letter : letters) {
				System.out.print(morseToEnglish.get(letter));
			}
			System.out.print(" ");
		}
	}
	
	public static void stringToMorse(String english) {
		//converts the english string to an array of words (Strings)
		String[] englishSplit = english.split(" ");
		//a for each loop that goes through each word, and splits it into an array letter
		int i = 0;
		for(String word : englishSplit) {
			i++;
			char[] letters = word.toCharArray();
			for(char letter : letters) {
				System.out.print(englishToMorse.get(letter) + " ");
			}
			//checks to see if its the last word in the sentence, if so don't print the word separator
			if(i != englishSplit.length) {
				System.out.print(" / ");
			}
		}
	}
	
	public static void populateEnglish() {
		
		englishToMorse = new HashMap<Character, String>();
		englishToMorse.put('a',     ".-");
        englishToMorse.put('b',   "-...");
        englishToMorse.put('c',   "-.-.");
        englishToMorse.put('d',    "-..");
        englishToMorse.put('e',      ".");
        englishToMorse.put('f',   "..-.");
        englishToMorse.put('g',    "--.");
        englishToMorse.put('h',   "....");
        englishToMorse.put('i',     "..");
        englishToMorse.put('j',   ".---");
        englishToMorse.put('k',    "-.-");
        englishToMorse.put('l',   ".-..");
        englishToMorse.put('m',     "--");
        englishToMorse.put('n',     "-.");
        englishToMorse.put('o',    "---");
        englishToMorse.put('p',   ".--.");
        englishToMorse.put('q',   "--.-");
        englishToMorse.put('r',    ".-.");
        englishToMorse.put('s',    "...");
        englishToMorse.put('t',      "-");
        englishToMorse.put('u',    "..-");
        englishToMorse.put('v',   "...-");
        englishToMorse.put('w',    ".--");
        englishToMorse.put('x',   "-..-");
        englishToMorse.put('y',   "-.--");
        englishToMorse.put('z',   "--..");
        englishToMorse.put('1',  ".----");
        englishToMorse.put('2',  "..---");
        englishToMorse.put('3',  "...--");
        englishToMorse.put('4',  "....-");
        englishToMorse.put('5',  ".....");
        englishToMorse.put('6',  "-....");
        englishToMorse.put('7',  "--...");
        englishToMorse.put('8',  "---..");
        englishToMorse.put('9',  "----.");
        englishToMorse.put('0',  "-----");
        englishToMorse.put('.', ".-.-.-");
        englishToMorse.put(',', "--..--");
	}
	
	public static void populateMorse() {
		morseToEnglish = new HashMap<String, Character>();
		for(HashMap.Entry<Character, String> entry : englishToMorse.entrySet()){
		    morseToEnglish.put(entry.getValue(), entry.getKey());
		}
	}
}
