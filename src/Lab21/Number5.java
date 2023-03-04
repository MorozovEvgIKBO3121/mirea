package Lab21;

import java.util.*;

public class Number5 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = newArrayList(Integer.valueOf(10), Integer.valueOf(20));
        System.out.println(arrayList);

        HashSet<String> hashSet = newHashSet("foo", "foo2", "foo3");
        System.out.println(hashSet);

        List<Integer> keys = Arrays.asList(1, 2, 3);
        List<String> values = Arrays.asList("one", "two", "three");
        HashMap<Integer, String> hashMap = newHashMap(keys, values);
        System.out.println(hashMap);
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        Collections.addAll(set, elements);
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Списки ключей и значений должны иметь одинаковый размер");
        }
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}
