
class Main {

	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;

		for (int i = 0; i < result.length; ++i) {
			if (leftIndex < left.length) {
				if (rightIndex < right.length) {
					if (left[leftIndex] < right[rightIndex]) {
						result[i] = left[leftIndex++];
					}
					else {
						result[i] = right[rightIndex++];
					}
				}
				else {
					result[i] = left[leftIndex++];
				}
			}
			else {
				result[i] = right[rightIndex++];
			}
		}
		return result;
	}

	private static int[] mergeSort(int[] array) {
		if (array.length <= 1) {
			return array;
		}

		int m = array.length / 2;

		int[] left = new int[m];
		for (int i = 0; i < left.length; ++i) {
			left[i] = array[i];
		}
		int[] right = new int[array.length-m];
		for (int i = 0; i < right.length; ++i) {
			right[i] = array[m+i];
		}

		return merge(mergeSort(left), mergeSort(right));
	}

	private static void printArray(int[] array) {
		for (int e : array) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int[] array = {12, 11, 13, 5, 6};
		int[] result = mergeSort(array);
		printArray(result);
	}

}

