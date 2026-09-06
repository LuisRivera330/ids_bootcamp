package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.writing_simple_lambdas.predicates;

//Se crea una interfaz funcional genérica
//El tipo de dato genérico se usa con el propósito de moldear distinto tipos de datos
public interface Predicate<T> {
    boolean test(T t);
}
