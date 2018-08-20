package ru.job4j.NonBlockingCache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Comp on 23.11.2017.
 */
public class NonBlockingCache<T extends Base> {
    private ConcurrentHashMap<Integer, Base> concurrentHashMap;
    private Base base = new Base();

    private ConcurrentMap<Long, T> cache;

    public NonBlockingCache(ConcurrentMap<Long, T> cache) {
        this.cache = cache;
    }

    public NonBlockingCache(ConcurrentHashMap<Integer, Base> concurrentHashMap) {
        this.concurrentHashMap = new ConcurrentHashMap<>();
    }

    public void add(Base model) throws OptimisticException {
        concurrentHashMap.put(model.getId(), model);
    }

    public void update (Base model) throws OptimisticException {
        cache.computeIfPresent ((long) model.getId(), new BiFunction<Long, T, T>() {
            @Override
            public T apply(Long aLong, T oldModel) {
                if (base.getVersion() == oldModel.getVersion()) {
                    model.updateVersion();
                    return (T) model;
                } else {
                    throw new OptimisticException("Error");
                }
            }
        });
    }

    public void delete (Base model) throws OptimisticException {
        concurrentHashMap.remove(model.getId(), model);
    }

    public void get (T key) throws OptimisticException {
        cache.getOrDefault(key, null);
    }
}
