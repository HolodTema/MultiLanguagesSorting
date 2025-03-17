
fun countingSort(array: Array<Int>): Array<Int> {
	var max = Int.MIN_VALUE
	for (e in array) {
		if (e > max) {
			max = e
		}
	}

	val countingArray = Array<Int>(max+1){0}
	for (e in array) {
		countingArray[e] ++
	}

	for (i in 1 until countingArray.size) {
		countingArray[i] += countingArray[i-1]
	}

	val result = Array<Int>(array.size){0}
	for (i in (array.size-1) downTo 0) {
		result[countingArray[array[i]]-1] = array[i]
	}
	return result
}

fun printArray(array: Array<Int>) {
	for (e in array) {
		println(e)
	}
}

fun main() {
	val array = arrayOf(12, 11, 13, 5, 6)
	val result = countingSort(array)
	printArray(result)
}

