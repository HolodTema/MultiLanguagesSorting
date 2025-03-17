
class Main {

	public static void insertionSort(int[] array) {
		int key = 0;
		int j = 0;
		for (int i = 1; i < array.length; ++i) {
			key = array[i];
			j = i-1;
			while (j >= 0 && array[j] > key) {
				array[j+1] = array[j];
				--j;
			}
			array[j+1] = key;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] array = {12, 11, 13, 5, 6};

		insertionSort(array);
		printArray(array);
	}
}

