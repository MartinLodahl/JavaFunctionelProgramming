package martin.lodahl.stackthingy;

public interface Path<T> {
    T getFirst();
    Path<T> getRest();
}
