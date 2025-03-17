#include <iostream>

void bubbleSort(int array[], int len) {
	for (int i = 0; i < len; ++i) {
		for (int j = 1; j < len; ++j) {
			if (array[j-1] > array[j]) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
	}
}

void printArray(int array[], int len) {
	for (int i = 0; i < len; ++i) {
		std::cout << array[i] << " ";
	}
	std::cout << "\n";
}

int main() {
	int array[] = {12, 11, 13, 5, 6};
	int len = sizeof(array) / sizeof(array[0]);

	bubbleSort(array, len);
	printArray(array, len);

	return 0;
}
