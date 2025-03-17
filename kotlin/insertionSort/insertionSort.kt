
fun insertionSort(array: Array<Int>) {
	var j = 0
	var key = 0
	for (i in 0 until array.size) {
		key = array[i]
		j = i-1
		while (j>=0 && array[j]>key) {
			array[j+1] = array[j]
			--j
		}
		array[j+1] = key
	}
}

fun printArray(array: Array<Int>) {
	for (e in array) {
		println(e)
	}
}

fun main() {
	val array = arrayOf(12, 11, 13, 5, 6)
	insertionSort(array)
	printArray(array)
}
