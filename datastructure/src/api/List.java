package api;

public interface List<T> {

    void add(T e);

    int size();

    T get(int index);

    boolean remove(T element);

    int indexOf(T element);

    boolean contains(T element);

    void clear();

}
