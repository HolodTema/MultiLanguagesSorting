
class Main {

	private static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			for (int j = 1; j < array.length; ++j) {
				if (array[j-1] > array[j]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}

	private static void printArray(int[] array) {
		for (int e : array) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int[] array = {12, 11, 13, 5, 6};
		bubbleSort(array);
		printArray(array);
	}

}
