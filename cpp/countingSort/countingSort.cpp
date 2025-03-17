#include <iostream>
#include <climits>

int* countingSort(int* array, int len) {
	int maxElement = INT_MIN;
	for (int i = 0; i < len; ++i) {
		if (array[i] > maxElement) {
			maxElement = array[i];
		}
	}

	int* countArray = new int[maxElement+1]{};
	
	for (int i = 0; i < len; ++i) {
		countArray[array[i]]++;
	}

	for (int i = 1; i < maxElement+1; ++i) {
		countArray[i] += countArray[i-1];
	}

	int* resultArray = new int[len]{};
	for (int i = len-1; i >= 0; --i) {
		resultArray[countArray[array[i]] -1] = array[i];
		countArray[array[i]]--;
	}
	
	delete[] countArray;

	return resultArray;
}

void printArray(int* array, int len) {
	for (int i = 0; i < len; ++i) {
		std::cout << array[i] << " ";
	}
	std::cout << "\n";
}

int main() {
	int* array = new int[]{12, 11, 13, 5, 6};
	int len = 5;

	int* result = countingSort(array, len);
	printArray(result, len);

	delete[] array;
	delete[] result;
	return 0;
}

