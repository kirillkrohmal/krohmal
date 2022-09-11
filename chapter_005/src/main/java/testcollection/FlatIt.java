package testcollection;

import java.util.*;
import java.util.stream.Stream;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return new ArrayList<>();
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
       return null;/*StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterators, 0), false)
               .flatMap(it -> StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false))
               .iterator();*/
    }
}
