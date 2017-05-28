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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
