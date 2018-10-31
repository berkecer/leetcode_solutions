class Solution {
    public String toLowerCase(String str) {
        
        // FOR EACH LETTER(CHAR) IN STR
        // AFTER ALL THEY ARE JUST NUMBERS 
        // CALCULATE THE DIFFERENCE BETWEEN UPPERCASE AND LOWERCASE
        // ADD THE DIFFERENCE FOR UPPERCASED LETTERS
        
        char[] str_chars = str.toCharArray();
        
        // CALCULATE THE CHARACTER CODE DIFFERENCE (LOWER - UPPER) 
		int diffCharCode = 'a' - 'A';

		for (int i=0; i < str_chars.length; i++) {
		    if (str_chars[i] >= 'A' && str_chars[i] <= 'Z') { // <='Z' CONTROL KEEPS LOWERCASE LETTERS LOWER CASED
		        str_chars[i] += diffCharCode;
		    }
		}
        return String.valueOf(str_chars);
    }
}