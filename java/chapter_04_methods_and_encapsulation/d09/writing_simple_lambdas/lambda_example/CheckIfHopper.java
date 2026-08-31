package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.writing_simple_lambdas.lambda_example;

//Se crea la clase  CheckIfHopper que implementa la interfaz CheckTrait
//Lo que se busca es comprobar si el animal puede saltar.
public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}