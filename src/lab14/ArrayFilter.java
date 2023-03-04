package lab14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Filter {
    boolean apply(Object o);
}

public class ArrayFilter {
    public static <T> T[] filter(T[] array, Filter filter) {
        List<T> list = new ArrayList<T>();
        for (T element : array) {
            if (filter.apply(element)) {
                list.add(element);
            }
        }
        return list.toArray(Arrays.copyOf(array, list.size()));
    }
}


