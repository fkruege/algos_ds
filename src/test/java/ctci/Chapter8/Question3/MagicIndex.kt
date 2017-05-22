package ctci.Chapter8.Question3

class MagicIndex {

    fun find(input: IntArray): Pair<Int, Int> {
        var begin = -1
        var end = -1

        for (i in input.indices) {
            if (i == input[i] && begin == -1) {
                begin = i
            }

            if (begin != -1 && i != input[i]) {
                end = i - 1
            }
        }
        if (end == -1) {
            end = input.size - 1
        }
        return Pair(begin, end)
    }

    fun find2(input: IntArray): Int {
        return findBinarySearch(input, 0, input.size - 1)

    }

    private fun findBinarySearch(input: IntArray, lowerBound: Int, upperBound: Int): Int {

        val mid = (lowerBound + upperBound) / 2

        if (lowerBound > upperBound) {
            return -1
        }

        val value = input[mid]
        if (value > mid) {
            return findBinarySearch(input, lowerBound, mid - 1)
        } else if (value < mid) {
            return findBinarySearch(input, mid + 1, upperBound)
        } else {
            return mid
        }


    }


}



