import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		int[] A = { -1, -3 };
//		int[] A = { 1, 3, 5, 4, 1, 2 };
		int[] A = { 1, 2, 3 };
		System.out.println(solution(A));

	}

	public static void DuplicateRemoval(int array[], int n) {
		if (n == 0 || n == 1) {
			return;
		}
		int k = 0;
		for (int i = 0; i < n - 1; i++) {
			if (array[i] != array[i + 1]) {
				array[k++] = array[i];
			}
		}
		array[k++] = array[n - 1];
		return;
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		Arrays.sort(A);

		DuplicateRemoval(A, A.length);

		for (int i = 0; i < A.length; i++) {
			boolean didIcheckOne = false;
			if (A[i] >= 0) {
				if (i + 1 < A.length) {
					int Comparison = i + 1;

					if (A[i] + 1 != A[Comparison]) {
						if (A[i] + 1 > 0) {
							return (A[i] + 1);
						}
					}
				} else {
					return (A[i] + 1);
				}
			} else {
				if (!didIcheckOne) {
					if (Arrays.binarySearch(A, 1) < 0) {
						// not contains
						didIcheckOne = true;
						return 1;
					}

				}
			}
		}
		return A[A.length - 1] + 1;

	}

}
