package lesson18;

import java.util.*;
import java.util.Iterator;

public class MultiMapImpl<K, V> implements MultiMap<K, V> {
    private HashMap<K, ArrayList<V>> multiMap = new HashMap<>();


    @Override
    public int countValues(K key) {
        return 0;
    }

    @Override
    public V get(Object key) {
        if (multiMap.containsKey(key)) {
            ArrayList<V> values = multiMap.get(key);
            return values.get(values.size() - 1);
        }


        return null;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        if (multiMap.containsKey(key)){
        return multiMap.get(key).iterator();}
        return new Iterator<V>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public V next() {
                return null;
            }
        };
    }

    @Override
    public V remove(Object key) {
        if (multiMap.containsKey(key)) {
            multiMap.remove(key);
        }
        return null;
    }

    @Override
    public int size() {
        return multiMap.size();
    }

    @Override
    public boolean isEmpty() {
        return multiMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {


        return multiMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        for (K key : multiMap.keySet()) {
            ArrayList<V> values = multiMap.get(key);
            if (values.contains(value)) {
                return true;

            }
        }


        return false;
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            ArrayList<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        } else {
            ArrayList<V> values = new ArrayList<>();
            values.add(value);
            multiMap.put(key, values);
        }

        return value;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m)  // добавляет одну мультимапу в другую.
    {




    }

    @Override
    public void clear() {
            multiMap.clear();
    }

    @Override
    public Set<K> keySet() {
        return multiMap.keySet();

    }

    @Override
    public Collection<V> values() {
        return (Collection<V>) multiMap.values();

    }

    @Override
    public Set<Entry<K, V>> entrySet() {

        return null;
    }
}
