package Coures2.model2;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
