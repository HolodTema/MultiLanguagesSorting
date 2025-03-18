

fun merge(array1: Array<Int>, array2: Array<Int>): Array<Int> {
	val result = Array<Int>(array1.size + array2.size) {0}
	var index = 0
	var index1 = 0
	var index2 = 0
	while (index1 < array1.size && index2 < array2.size) {
		result[index++] = if (array1[index1] < array2[index2]) {
			array1[index1++]
		}
		else {
			array2[index2++]
		}
	}

	while (index1 < array1.size) {
		result[index++] = array1[index1++]
	}

	while (index2 < array2.size) {
		result[index++] = array2[index2++]
	}
	return result
}

fun mergeSort(array: Array<Int>): Array<Int> {
	if (array.size <= 1) {
		return array
	}

	val m = array.size / 2

	val left = Array<Int>(m) {0}
	val right = Array<Int>(array.size - m) {0}
	for (i in 0 until left.size) {
		left[i] = array[i]
	}
	for (i in 0 until right.size) {
		right[i] = array[i+m]
	}

	return merge(mergeSort(left), mergeSort(right))
}

fun printArray(array: Array<Int>) {
	array.forEach { 
		println(it)
	}
}

fun main() {
	val array = arrayOf(12, 11, 13, 5, 6, 100, 8, 37, 40, 11, 5, 2)
	val result = mergeSort(array)
	printArray(result)
}



