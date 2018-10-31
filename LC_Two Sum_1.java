import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

    	// SOLUTION WITHOUT COMPLEX DATA TYPES SUCH AS HASHMAP

        int[] realIndexesBeforeSort = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			realIndexesBeforeSort[i] = i;
		}
		
		// SORT
		Solution.bubble_srt(nums, realIndexesBeforeSort);

		
		// For each number search for a complement to target by using their difference
		// (target - nums[i])
		for (int i = 0; i < nums.length; i++) {
			// Binary search the difference in sortedArray

			int returnIndexFromSortedArray = Arrays.binarySearch(nums, target - nums[i]);
			if (returnIndexFromSortedArray > -1) { // if binary search finds
				
				// Find the values real index in nums

				int desiredIndex = Arrays.binarySearch(nums, nums[returnIndexFromSortedArray]);
				// No duplicates checked by indexes
				if (desiredIndex > -1 && desiredIndex != i) {
					return new int[] {realIndexesBeforeSort[i] , realIndexesBeforeSort[desiredIndex]};
				}
			}
		}
        throw new IllegalArgumentException("No two sum solution");
        
    }
    
    // logic to sort the elements
    public static void bubble_srt(int array[], int indexes[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array,indexes);
                }
            }
        }
    }
  
    private static void swapNumbers(int i, int j, int[] array, int indexes[]) {
    	
    	// Basic Swap
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
        // In order to prevent Index loss we changed values of indexes array
        temp = indexes[i]; 
        indexes[i] = indexes[j];
        indexes[j] = temp;
    }
    
}