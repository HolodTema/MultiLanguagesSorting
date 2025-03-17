#include <iostream>

void insertionSort(int array[], int len) {
	int key = 0;
	int j = 0;
	for (int i = 1; i < len; ++i) {
		key = array[i];
		j = i-1;

		while(j >= 0 && array[j] > key) {
			array[j+1] = array[j];
			--j;
		}
		array[j+1] = key;
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

	insertionSort(array, len);
	printArray(array, len);

	return 0;
}
