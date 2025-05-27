package org.example.lambda.lambda5.myStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// static factory 추가
public class MyStreamV2<T> {

    private List<T> internalList;

    private MyStreamV2(List<T> internalList) {
        this.internalList = internalList;
    }

    // static factory
    public static <T> MyStreamV2<T> of(List<T> internalList) {
        return new MyStreamV2(internalList);
    }
    public MyStreamV2<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T element : internalList) {
            if(predicate.test(element)) {
                filtered.add(element);
            }
        }
        return MyStreamV2.of(filtered);
    }

    public <R> MyStreamV2<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for (T element : internalList) {
            mapped.add(mapper.apply(element));
        }
        return MyStreamV2.of(mapped);
    }

    public List<T> toList() {
        return internalList;
    }

    public void forEach(Consumer<T> consumer) {
        for (T element : internalList) {
            consumer.accept(element);
        }
    }

    // 추가
    public T getFirst() {
        return internalList.get(0);
    }
}
