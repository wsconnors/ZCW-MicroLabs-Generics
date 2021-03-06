package Table;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry<K, V>> entries;

    public Table() {
        entries = new ArrayList<Entry<K, V>>();
    }

    public void put(K key, V value) {
        if (getEntry(key) != null) {
            remove(key);
        }
        entries.add(new Entry<>(key, value));
    }

    public V get(K key) {
        Entry<K, V> returnEntry = getEntry(key);
        if (returnEntry != null) {
            return getEntry(key).getValue();
        }
        return null;
    }

    public void remove(K key) {
        Entry<K, V> deleteEntry = getEntry(key);
        if (deleteEntry != null) {
            entries.remove(getEntry(key));
        }
    }

    private Entry<K, V> getEntry(K key) {
        for (Entry<K, V> entry : entries) {
            if (key.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

}
