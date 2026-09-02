package ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.polymorphic_parameters;

public class ZooWorker {
    //Se crea el método feed. Es de acceso público, estático,
    //no tiene retorno. Tiene un parámetro de entrada de la clase Reptile
    //Dentro del método se imprime el método getName()
    public static void feed(Reptile reptile){
        System.out.println("Feeding reptile "+ reptile.getName());
    }

    public static void main(String[] args) {
        //Se invoca 3 veces el método feed
        //La diferencia de cada uno de ellos.
        //Es que se utilizan diferentes subclases del método reptile
        //Por lo tanto, se puede utilizar Alligator y Crocodile
        feed(new Alligator());
        feed(new Crocodile());
        feed(new Reptile());


    }
}
