//K번째 수
fun main(args: Array<String>) {
    val arr: IntArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val com: Array<IntArray> = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
    val result: IntArray = solution03(arr, com)

    for (i in result) {
        println(i)
    }
}

fun solution03(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()

    fun arrayCutter(arr: IntArray, st: Int, end: Int): IntArray {
        var resultArr: IntArray = intArrayOf()

        for (i in st - 1..end - 1) {
            resultArr += arr[i]
        }

        resultArr.sort()
        return resultArr
    }

    fun arrayPicker(arr: IntArray, pickNum: Int): Int {
        val result: Int = arr[pickNum - 1]

        return result
    }

    for (i in 0 until commands.size) {
        answer += arrayPicker(arrayCutter(array, commands[i][0], commands[i][1]), commands[i][2])

    }

    return answer
}