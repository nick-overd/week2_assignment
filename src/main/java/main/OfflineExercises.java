package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") -> "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		//String str = "apple";
		//str.
		//for every input repeat each unquie letter 3times
		String x = "";
		for( char z : input.toCharArray()) {
			for(int i = 0; i < 3; i++ ) {
				x+=z;
			}
			// input.substring(0,1) + inputinput.substring(0,1)
			
		}
		
		return x;
//			String.join(delimiter, elements)
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
//		for(char i = input.charAt(0); i < input.length(); i++) {
		//nope
		String x = "";
		if(input.toLowerCase().contains("bert")) {
			if(input.toLowerCase().substring(input.toLowerCase().indexOf("bert") + 4 ).contains("bert")) {
				String y = input.toLowerCase().substring(input.toLowerCase().indexOf("bert") + 4, input.toLowerCase().lastIndexOf("bert") );
				//System.out.println(y);
				for(int i = y.length() -1; i > -1; i--) {
					x += y.toCharArray()[i];
				}
				//x+=y.toCharArray()[0];
			}
			
		}
		return x;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int d = (b-c); int e = (a-b); int d2 = (c-b); int e2 = (b-a); int f =(a-c); int f2 = (c-a);
		if(a==d) {
			return true;
			}
		else if(d2 == a) {
			return true;
			}
		else if(e==c) {
				return true;
			}
		else if(e2 == c) {
			return true;
			}
		else if(f == b) {
			return true;
			}
		else if(f2 == b) {
			return true;
			}
		else { 
		return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
//		remove.substring()
			int len = input.length();
			int midIndex = len/2;
			int offset = a/2;
			String oldStrStart = input.substring(0, (midIndex-offset));
			String oldStrEnd = input.substring((len-midIndex+offset), len);
			return oldStrStart+oldStrEnd;
		}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if(input.length() > 2) {
			return input.toLowerCase().substring((input.length() -3), input.length()).equals("dev");
			
				
		}
		else {
		return false;
		}
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		if (input.equals("") || input == null ) {
			return 0;
		}
		int count = 1;
		String lastLetter = "";
		int maxcount = 1;
		for( int i= 0; i < input.length(); i++) {
			String letter = input.substring(i,i+1);
			if(letter.equals(lastLetter)) {
				count++;
			}
			else {
				if(count > maxcount) {
					maxcount = count;
				}
				count = 1;
			}
			lastLetter = letter;
		}
		return maxcount;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int count = 0;
		String[] sentence=arg1.toLowerCase().split(" ");
		for (int i=0; i < sentence.length; i++ ) {
			if(sentence[i].equals("am")) {
				count++;
			}
		}
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		int y = arg1;
//		String y = String.valueOf(0)
		if(y % 15 ==0) {
			 return "fizzbuzz";
		 }
		else if(y % 3 ==0) {
			return "fizz";
		 }
		 else 	if(y % 5 ==0) {
			return "buzz";
			}
		else {
			return "not divisable by 3 or 5";
		}
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		//switch statement might work
//		ArrayList <String> row	= new ArrayList<String>();
		//while loop in a while loop 
		int temp = 0;
		int max = 0;
		for(int i=0; i < arg1.length();i++ ) {
			System.out.println(temp);
			System.out.println(i);
			if(arg1.toCharArray()[i]== ' ') {
				
				if (temp>max) {
					max=temp;
				}
				temp=0;
			}else {
				temp += Integer.parseInt(arg1.substring(i,i+1));
			
			}
		}if (temp>max) {
			max=temp;
		}
		
		return max;
		
	}
	
	
}
