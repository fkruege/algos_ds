package ctci.Chapter8.Question3

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by fkruege on 5/21/17.
 */
class MagicIndexTest {

    lateinit var magicIndex: MagicIndex

    @Before
    fun setUp() {
        magicIndex = MagicIndex()
    }

    @Test
    fun find() {
        val array = IntArray(10)
        for (i in array.indices) {
            array[i] = i
        }

        val pair = magicIndex.find(array)

        assertEquals(0, pair.first)
        assertEquals(9, pair.second)
    }

    @Test
    fun findBinarySearch() {

        val array = getTestArray()
        array[0] = 0
        array[1] = 100
        array[2] = 200
        array[3] = 300
        array[4] = 400
        array[5] = 500
        array[6] = 600
        array[7] = 700
        array[8] = 800
        array[9] = 900

        val result = magicIndex.find2(array)
        assertEquals(0, result)

    }


    @Test
    fun findBinarySearch2() {

        val array = getTestArray()
        array[0] = -1000
        array[1] = -400
        array[2] = -200
        array[3] = -100
        array[4] = 0
        array[5] = 5
        array[6] = 600
        array[7] = 700
        array[8] = 800
        array[9] = 900

        val result = magicIndex.find2(array)
        assertEquals(5, result)
    }


    @Test
    fun findBinarySearch3() {
        val array = getTestArray()
        array[0] = -1000
        array[1] = -400
        array[2] = -200
        array[3] = 3
        array[4] = 100
        array[5] = 200
        array[6] = 600
        array[7] = 700
        array[8] = 800
        array[9] = 900

        val result = magicIndex.find2(array)
        assertEquals(3, result)
    }


    @Test
    fun findBinarySearch4() {
        val array = getTestArray()
        array[0] = -1000
        array[1] = -400
        array[2] = -200
        array[3] = -100
        array[4] = -10
        array[5] = -9
        array[6] = -8
        array[7] = -7
        array[8] = -6
        array[9] = 9

        val result = magicIndex.find2(array)
        assertEquals(9, result)
    }


    @Test
    fun findBinarySearch5() {
        val array = getTestArray()
        array[0] = -1000
        array[1] = -400
        array[2] = -200
        array[3] = -100
        array[4] = -10
        array[5] = -9
        array[6] = -8
        array[7] = -7
        array[8] = -6
        array[9] = 10

        val result = magicIndex.find2(array)
        assertEquals(-1, result)
    }

    fun getTestArray(): IntArray {
        val array = IntArray(10)

        for (i in array.indices) {
            array[i] = i
        }

        return array
    }


}