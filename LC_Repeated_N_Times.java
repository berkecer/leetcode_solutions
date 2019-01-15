class Solution {
    public int repeatedNTimes(int[] A) {
        // length check
		if (A.length < 4 ||  A.length > 10000) {
			System.out.println("Invalid length of array.");
		}
		
		HashSet<Integer> numbers = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (numbers.contains(A[i])) {
				return A[i];
			}else {
				numbers.add(A[i]);
			}
		}
        return -1;
    }
}