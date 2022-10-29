package Iterator;

public interface Iterator {
    boolean hasNext();

    String current();

    void next();
}

/*
 * we can opt for generic iterator
 * public interface Iterator<T> {
 * boolean hasNext();
 * T current();
 * void next();
 * }
 */