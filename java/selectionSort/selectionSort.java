
class Main {
	
	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			int minKey = Integer.MAX_VALUE;
			int minIndex = 0;
			for (int j = i; j < array.length; ++j) {
				if (array[j] < minKey) {
					minKey = array[j];
					minIndex = j;
				}
			}

			int temp = array[i];
			array[i] = minKey;
			array[minIndex] = temp;
		}
	}

	private static void printArray(int[] array) {
		for (int e : array) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int[] array = {12, 11, 13, 5, 6};
		selectionSort(array);
		printArray(array);
	}

}
