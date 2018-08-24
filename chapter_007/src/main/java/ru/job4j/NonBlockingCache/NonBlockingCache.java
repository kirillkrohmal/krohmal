package ru.job4j.NonBlockingCache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Comp on 23.11.2017.
 */
public class NonBlockingCache<T extends Base> {
    private final ConcurrentMap<Long, T> cache;

    public NonBlockingCache(ConcurrentMap<Long, T> cache) {
        this.cache = new ConcurrentHashMap<>();
    }

    public void add(T model) throws OptimisticException {
        this.cache.put(model.getId(), model);
    }

    public void update (T model) throws OptimisticException {
        this.cache.computeIfPresent ((long) model.getId(), new BiFunction<Long, T, T>() {
            @Override
            public T apply(Long aLong, T oldModel) {
                if (model.getVersion() == oldModel.getVersion()) {
                    model.updateVersion();
                    return (T) model;
                } else {
                    throw new OptimisticException("Error");
            }
            }
        });
    }

    public void delete (T model) throws OptimisticException {
        this.cache.remove(model.getId(), model);
    }

    public void get (long key) throws OptimisticException {
        this.cache.getOrDefault(key, null);
    }
}
