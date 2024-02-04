package in.balamt.practice.lambda.function;

public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
