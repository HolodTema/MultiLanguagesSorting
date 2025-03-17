#include <iostream>
#include <climits>

void selectionSort(int array[], int len) {
	for (int i = 0; i < len; ++i) {
		int indexMin = 0;
		int keyMin = INT_MAX;
		for (int j = i; j < len; ++j) {
			if (array[j] < keyMin) {
				keyMin = array[j];
				indexMin = j;
			}
		}

		int temp = array[i];
		array[i] = keyMin;
		array[indexMin] = temp;
	}
}

void printArray(int array[], int len) {
	for (int i = 0; i < len; ++i) {
		std::cout << array[i] << " ";
	}
	std::cout << "\n";
}

int main() {
	int array[] = {12, 13, 11, 5, 6};
	int len = sizeof(array) / sizeof(array[0]);

	selectionSort(array, len);
	printArray(array, len);

	return 0;
}
