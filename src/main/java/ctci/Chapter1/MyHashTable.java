package ctci.Chapter1;

/**
 * Created by fkruege on 3/21/17.
 */
public class MyHashTable<Key, Value> {

    private final int DOUBLE_CAPACITY = 2;
    private final int QUARTER_CAPACITY = 4;

    private HashEntry<Key, Value>[] mHashMap;
    private int mCapacity;
    private int mSize;


    public MyHashTable(int capacity) {
        mCapacity = capacity;
        mSize = 0;
        mHashMap = (HashEntry<Key, Value>[]) new HashEntry[mCapacity];
    }

    public int size() {
        return mSize;
    }

    public void put(Key key, Value value) {
        if (addEntry(key, value)) {
            incrementSize();
        }
    }


    public Value get(Key key) {
        int index = getIndex(key);
        return getValueForKey(index, key);
    }

    public void delete(Key key) {
        deleteKey(key);
    }

    public boolean containsKey(Key key) {
        int index = getIndex(key);
        return getValueForKey(index, key) != null;
    }

    private boolean addEntry(Key key, Value value) {
        int index = getIndex(key);
        if (mHashMap[index] == null) {
            return addFirstEntryToList(index, key, value);
        } else {
            return addOrUpdateEntry(index, key, value);
        }
    }


    private boolean addFirstEntryToList(int index, Key key, Value value) {
        HashEntry newEntry = new HashEntry<Key, Value>(key, value);
        newEntry.mNext = null;
        mHashMap[index] = newEntry;
        return true;
    }

    private boolean addOrUpdateEntry(int index, Key key, Value value) {
        HashEntry current = getHashEntry(index);
        HashEntry previous = current;

        while (current != null) {
            if (current.mKey.equals(key)) {
                current.mValue = value;
                return false;
            }
            previous = current;
            current = current.mNext;
        }

        previous.mNext = new HashEntry<Key, Value>(key, value);
        return true;
    }

    private void incrementSize() {
        mSize++;
        boolean over50pct = mSize >= mCapacity / 2;
        if (over50pct) {
            increaseCapacity();
        }
    }

    private void decrementSize() {
        mSize--;
        boolean lessThen25pct = mSize <= mCapacity / 4;
        if (lessThen25pct) {
            decreaseCapacity();
        }
    }

    private HashEntry<Key, Value> getHashEntry(int index) {
        HashEntry<Key, Value> current = mHashMap[index];
        return current;
    }

    private Value getValueForKey(int index, Key key) {
        HashEntry current = getHashEntry(index);

        while (current != null) {
            if (current.mKey.equals(key)) {
                return (Value) current.mValue;
            }
            current = current.mNext;
        }
        return null;
    }


    private void deleteKey(Key key) {
        int index = getIndex(key);
        HashEntry<Key, Value> current = getHashEntry(index);
        HashEntry<Key, Value> previous = null;

        while (current != null) {
            if (current.mKey.equals(key)) {
                if (previous == null) {
                    mHashMap[index] = current.mNext;
                } else {
                    previous.mNext = current.mNext;
                }
                decrementSize();
            }
            previous = current;
            current = current.mNext;
        }
    }


    private int getIndex(Key key) {
        int hashCode = key.hashCode();
        int index = hashCode % mCapacity;
        return index;
    }


    private void increaseCapacity() {
        mCapacity *= DOUBLE_CAPACITY;
        resizeArray();
    }

    private void decreaseCapacity() {
        mCapacity /= QUARTER_CAPACITY;
        resizeArray();
    }

    private void resizeArray() {
        HashEntry<Key, Value>[] oldArray = mHashMap;
        mHashMap = (HashEntry<Key, Value>[]) new HashEntry[mCapacity];
        copyArray(oldArray, mHashMap);
    }

    private void copyArray(HashEntry<Key, Value>[] source, HashEntry<Key, Value>[] dest) {
        for (HashEntry<Key, Value> entry : source) {
            HashEntry<Key, Value> current = entry;
            while (current != null) {
                addEntry(current.mKey, current.mValue);
                current = current.mNext;
            }
        }
    }

    private static class HashEntry<Key, Value> {

        private Key mKey;
        private Value mValue;
        private HashEntry mNext;

        public HashEntry(Key key, Value value) {
            mKey = key;
            mValue = value;
            mNext = null;
        }

    }


}
