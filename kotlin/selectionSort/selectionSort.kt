

fun selectionSort(array: Array<Int>) {
	for (i in 0 until array.size) {
		var minIndex = 0
		var minKey = Int.MAX_VALUE
		for (j in i until array.size) {
			if (array[j] < minKey) {
				minKey = array[j]
				minIndex = j
			}
		}

		val temp = array[i]
		array[i] = minKey
		array[minIndex] = temp
	}
}

fun main() {
	val array = arrayOf(12, 11, 13, 5, 6)
	selectionSort(array)

	for (e in array) {
		println(e)
	}
}
