class Solution {
	public String reverseString(String s) {

		// CONVERT STRING TO CHAR ARRAY
		// ITERATE STARTS FROM END OF THE STRING AND ADD CHAR BY CHAR TO THE REVERSED STRING
		// RETURN REVERSED

		char[] stringToCharArray = s.toCharArray();
		String reversed = "";
		for (int i = stringToCharArray.length - 1; i >= 0; i--) {
			reversed += stringToCharArray[i] + "";
		}
		return reversed;
	}
}