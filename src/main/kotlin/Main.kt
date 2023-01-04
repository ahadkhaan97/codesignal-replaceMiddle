fun main() {
    solution(mutableListOf(7, 2, 2, 5, 10, 7)).forEach {
        print("$it ")
    }
}

fun solution(arr: MutableList<Int>): MutableList<Int> {
    if (arr.size % 2 != 0)
        return arr

    arr[arr.size / 2] = arr[arr.size / 2] + arr[(arr.size / 2) - 1]
    arr.removeAt((arr.size / 2) - 1)
    return arr
}
