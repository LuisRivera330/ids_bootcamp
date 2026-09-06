package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.writing_simple_lambdas.lambda_example;

public class Animal {
    //Se crean tres variables de instancia. La primera de tipo String y las dos siguientes de tipo boolean
    private String species;
    private boolean canHop;
    private boolean canSwim;

    //Se crea un constructor donde se define las variables. Se toma como parámetros las 3 variables de instancia
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    //Hay dos métodos que obtienen el estado del animal
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    //Asimismo, hay método `toString()` para identificar fácilmente al animal en los programas.
    public String toString() { return species; }



}
