

fun bubbleSort(array: Array<Int>) {
	for (i in 0 until array.size) {
		for (j in 1 until array.size) {
			if (array[j-1] > array[j]) {
				val temp = array[j]
				array[j] = array[j-1]
				array[j-1] = temp
			}
		}
	}
}

fun printArray(array: Array<Int>) {
	for (e in array) {
		println(e)
	}
}

fun main() {
	val array = arrayOf(12, 11, 13, 5, 6)
	bubbleSort(array)
	printArray(array)
}

