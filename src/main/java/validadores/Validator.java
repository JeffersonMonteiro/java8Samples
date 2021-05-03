package validadores;

@FunctionalInterface
public interface Validator<T> {
    boolean valida(T t);
   /* boolean outroMetodo(T t);*/
}
