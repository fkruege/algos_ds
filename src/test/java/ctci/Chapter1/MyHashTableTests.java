
package ctci.Chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by fkruege on 3/22/17.
 */
public class MyHashTableTests {

    @Test
    public void basicTest() {
        MyHashTable<String, String> hashTable = new MyHashTable<String, String>(5);

        hashTable.put("a", "aa");
        hashTable.put("b", "bb");
        hashTable.put("c", "cc");
        hashTable.put("d", "dd");
        hashTable.put("e", "ee");

        assertTrue(hashTable.containsKey("a"));
        assertTrue(hashTable.containsKey("b"));
        assertTrue(hashTable.containsKey("c"));
        assertTrue(hashTable.containsKey("d"));
        assertTrue(hashTable.containsKey("e"));

        assertEquals("aa", hashTable.get("a"));
        assertEquals("bb", hashTable.get("b"));
        assertEquals("cc", hashTable.get("c"));
        assertEquals("dd", hashTable.get("d"));
        assertEquals("ee", hashTable.get("e"));
    }


    @Test
    public void basicTest2() {
        MyHashTable<String, String> hashTable = new MyHashTable<String, String>(1);

        hashTable.put("a", "aa");
        hashTable.put("b", "bb");
        hashTable.put("c", "cc");
        hashTable.put("d", "dd");
        hashTable.put("e", "ee");

        assertEquals(5, hashTable.size());

        assertTrue(hashTable.containsKey("a"));
        assertTrue(hashTable.containsKey("b"));
        assertTrue(hashTable.containsKey("c"));
        assertTrue(hashTable.containsKey("d"));
        assertTrue(hashTable.containsKey("e"));

        assertEquals("aa", hashTable.get("a"));
        assertEquals("bb", hashTable.get("b"));
        assertEquals("cc", hashTable.get("c"));
        assertEquals("dd", hashTable.get("d"));
        assertEquals("ee", hashTable.get("e"));

        hashTable.delete("a");
        assertEquals(4, hashTable.size());
        assertNull(hashTable.get("a"));

        hashTable.delete("e");
        assertEquals(3, hashTable.size());

        assertEquals("bb", hashTable.get("b"));
        assertEquals("cc", hashTable.get("c"));
        assertEquals("dd", hashTable.get("d"));


        hashTable.delete("b");
        hashTable.delete("c");
        hashTable.delete("d");

        assertEquals(0, hashTable.size());
    }
}
