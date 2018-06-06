package ru.job4j.StoreGeneric;

/**
 * Created by Comp on 24.09.2017.
 */
public abstract class AbstractStore<T extends Base> implements Store<T> {
    private Base[] baseT = new Base[100];
    private int index = 0;

    @Override
    public T add(T model) {
        baseT[index++] = model;
        return (T) baseT[index - 1];
    }

    @Override
    public T update(T model) {
        //получить идентфик объекта который сохраняю если он совпадает на его место записать
        for (int i = 0; i < baseT.length; i++) {
            if (baseT[i].getId().equals(model.getId())) {
                baseT[index] = model;
                break;
            }
        }
        return (T) baseT[index];
    }

    @Override
    public boolean delete(String id) {
        for (int i = 0; i < baseT.length; i++) {
            if (baseT[i].getId().equals(id)) {
                baseT[index] = null;
                return true;
            }
        }
        return false;
    }
}
