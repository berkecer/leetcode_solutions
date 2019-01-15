class Solution {
    public int[][] kClosest(int[][] points, int K) {
        if (K < 1 || K > 10000) {
			System.out.println("Invalid numbers");
		}
		
		HashMap<Double, int[]> pointsWithDistances = new HashMap<>();
		for (int[] is : points) {
			pointsWithDistances.put(Math.sqrt(Math.pow(is[0], 2)  + Math.pow(is[1], 2)), is);
		}
		
		List<Double> distances = new ArrayList<Double>(pointsWithDistances.keySet());
		
		Collections.sort(distances);
		int[][] results = new int[K][];
		
		for (int i = 0; i < K; i++) {
			results[i] = pointsWithDistances.get(distances.get(i));
		}
		
		return results;
    }
}