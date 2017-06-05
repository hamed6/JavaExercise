import java.util.ArrayList;

public class CodeWars {

	public static String printerError(String s) {
		char end = 'm';
		int err = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > end)
				err++;
		}
		return (err + "/" + s.length());
	}

	// return s.replaceAll("[a-m]", "").length() + "/" + s.length();

	// --------------------------------------------------------------------------------

	public static int[] minMax(int[] arr) {
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (arr[i] < min)
				min = arr[i];
		}
		int[] re = { min, max };
		return re;
	}

	/*
	 * Arrays.sort(arr); return new int[]{arr[0],arr[arr.length-1]};
	 */
	// --------------------------------------------------------------------------------
	public static int getCount(String str) {
		int vowelsCount = 0;
		String vowel = "aeiou";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowel.length(); j++) {
				if (str.charAt(i) == vowel.charAt(j))
					vowelsCount++;
			}
		}
		return vowelsCount;
	}

	/*
	 * return str.replaceAll("(?i)[^aeiou]", "").length();
	 * 
	 * OR 
	 * int vowelsCount = 0;
	 * for(char c : str.toCharArray()) vowelsCount += (c == 'a' || c == 'e' || c
	 * == 'i' || c == 'o' || c == 'u') ? 1 : 0;
	 * 
	 * return vowelsCount;
	 */
	
	//--------------------------------------------------------------------------------
	
	public static String makeComplement(String dna) {
		ArrayList<String> ar=new ArrayList<String>();
		for (Character c : dna.toCharArray()) {
			if (c=='A'){
				ar.add("T");
			}
			if (c=='T'){
				ar.add("A");
			}
			if (c=='G'){
				ar.add("C");
			}
			if (c=='C'){
				ar.add("G");
			}
		}
		return ar.toString().replaceAll("[\\W+]", "");
		
	}
	   /*  1St solution 
	    dna = dna.replaceAll("A","Z");
	    dna = dna.replaceAll("T","A");
	    dna = dna.replaceAll("Z","T");
	    dna = dna.replaceAll("C","Z");
	    dna = dna.replaceAll("G","C");
	    dna = dna.replaceAll("Z","G");
	    return dna;
	  }*/
		
		/*2Nd solution
		    char[] chars = dna.toCharArray();
		    for(int i = 0; i < chars.length; i++) {
		      chars[i] = getComplement(chars[i]);
		    }
		    
		    return new String(chars);
		  }
		  
		  private static char getComplement(char c) {
		    switch(c) {
		      case 'A': return 'T';
		      case 'T': return 'A';
		      case 'C': return 'G';
		      case 'G': return 'C';
		    }
		    return c;
		  }
		*/
		
	//--------------------------------------------------------------------------------
	
	public class CamelCaseMethod {
	public static String camelCase(final String string) {
		
		ArrayList<Character> myAr = new ArrayList<Character>();
		for (int j = 0; j < string.split(" ").length; j++) {
			String ss = string.split(" ")[j];
			for (int i = 0; i < ss.length(); i++) {
				if (i == 0) {
					char c = ss.charAt(i);
//					myAr.add(Character.toUpperCase(c));
					myAr.add(Character.toUpperCase(ss.charAt(i)));
				} else
					myAr.add(ss.charAt(i));
			}
		}
		return myAr.toString().replaceAll("[\\W]", "");
	}
	
	// --------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
