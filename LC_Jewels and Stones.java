class Solution {
    public int numJewelsInStones(String J, String S) {
        int jewelCounter = 0;
		// search for each letter in S, if J contains that letter increase counter
		for (int i = 0; i < S.length(); i++) {
			if (J.contains(S.charAt(i) + "")) { // contains need CharSequence so implictly cast our char to string
				jewelCounter++;
			}
		}
        return jewelCounter;
    }
}