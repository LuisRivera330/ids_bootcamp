package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.writing_simple_lambdas.lambda_example;

import java.util.ArrayList;
import java.util.List;


public class TraditionalSearch {
    public static void main(String[] args) {
        //Se declara un ArrayList de tipo Animal.
        //En el se agregaran todos lo animales que serán evaluados
        List<Animal> animals = new ArrayList<Animal>();
        //Se agrega elementos a la lista con sus respectivas características
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        //Se invoca al método print, el cual necesita dos párametros uno de tipo ArrayList(Animal) y otro de tipo CheckTrait
        print(animals, new CheckIfHopper());
        //Con esta línea de comando le estamos indicando a Java que solo nos interesan los animales que pueden saltar.
        //El segundo parámetro del método print es una expresión lambda.
        //Como el método de esa interfaz acepta un Animal. Significa que el parámetro de la lambda debe ser un Animal
        print(animals, a -> a.canHop());
        //La siguiente línea de código nos indica que animales pueden nadar
        print(animals, a -> a.canSwim());
        //Animales que no pueden nadar
        print(animals, a -> ! a.canSwim());

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        //Se crea un bucle for-each que itera todos los elementos de la lista animals
        for (Animal animal : animals) {
            //Se utiliza el método test, el cual revisa si el animal puede saltar.
            //Si su valor es true. Se imprime el nombre del animal que puede realizar esta acción
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
    //El siguiente bloque de código está bien planteado pero no es la mejor opción ya que, para saber si el animal puede nadar
    //se tendría que crear otro método CheckIfSwims
    //Luego invocar nuevamente al método print y verificar ello
}
