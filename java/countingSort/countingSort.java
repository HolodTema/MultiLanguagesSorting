
class Main {

	private static int[] countingSort(int[] array) {
		int maxElement = Integer.MIN_VALUE;
		for (int e : array) {
			if (e > maxElement) {
				maxElement = e;
			}
		}

		int[] countingArray = new int[maxElement+1];

		for (int e : array) {
			countingArray[e]++;
		}

		for (int i = 1; i < countingArray.length; ++i) {
			countingArray[i] += countingArray[i-1];
		}

		int[] result = new int[array.length];
		for (int i = array.length-1; i >= 0; --i) {
			result[countingArray[array[i]]-1] = array[i];
		}
		return result;
	}

	private static void printArray(int[] array) {
		for (int e : array) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int[] array = {12, 11, 13, 5, 6};
		int[] result = countingSort(array);
		printArray(result);
	}

}
