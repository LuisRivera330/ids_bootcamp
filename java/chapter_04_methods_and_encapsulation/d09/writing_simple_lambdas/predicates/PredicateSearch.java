package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.writing_simple_lambdas.predicates;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.writing_simple_lambdas.lambda_example.Animal;

import java.util.ArrayList;
import java.util.List;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        //La línea 14 es lo único que varia con el ejemplo de TraditionalSearch
        //En este caso se pasa un parámetro de tipo Predicate donde se determina si el objeto puede realizar la acción de saltar
        print(animals, a -> a.canHop());

        //Segundo caso:
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        //El método removeIf de ArrayList recibe un Predicate
        //La línea de código 24 nos indica remover todos los nombres que sean diferentes de h
        //Se imprime la lista. En este caso solo 'hoopy'
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);
    }

    private static void print(List<Animal> animals, Predicate<Animal>checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }




}
