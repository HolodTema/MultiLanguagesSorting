#include <iostream>

void merge(int* array, int left, int m, int right) {

	int leftSize = m-left+1;
	int rightSize = right-m;
	int* leftArray = new int[leftSize];
	int* rightArray = new int[rightSize];

	for (int i = 0; i < leftSize; ++i) {
		leftArray[i] = array[left+i];
	}
	for (int i = 0; i < rightSize; ++i) {
		rightArray[i] = array[m+1+i];
	}

	int index = left;
	int leftIndex = 0;
	int rightIndex = 0;
	while (leftIndex < leftSize && rightIndex < rightSize) {
		if (leftArray[leftIndex] < rightArray[rightIndex]) {
			array[index++] = leftArray[leftIndex++];
		}
		else {
			array[index++] = rightArray[rightIndex++];
		}
	}

	while (leftIndex < leftSize) {
		array[index++] = leftArray[leftIndex++];
	}
	while (rightIndex < rightSize) {
		array[index++] = rightArray[rightIndex++];
	}
	delete[] leftArray;
	delete[] rightArray;
}

void mergeSort(int* array, int left, int right) {
	if (left >= right) {
		return;
	}

	int m = (left + right) / 2;
	mergeSort(array, left, m);
	mergeSort(array, m+1, right);
	merge(array, left, m, right);
}

void printArray(int* array, int len) {
	for (int i = 0; i < len; ++i) {
		std::cout << array[i] << " ";
	}
	std::cout << "\n";
}

int main() {
	int* array = new int[]{0, 8, 0, 3, 1, 47, 100, 2, 30, 8};
	mergeSort(array, 0, 9);
	printArray(array, 10);

	delete[] array;
	return 0;
}
