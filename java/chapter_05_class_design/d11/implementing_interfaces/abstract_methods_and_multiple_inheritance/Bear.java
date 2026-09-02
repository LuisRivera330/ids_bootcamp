package ids_bootcamp.java.chapter_05_class_design.d11_creating_abstract_classes.abstract_methods_and_multiple_inheritance;

//La clase Bear implementa de las interfaces Herbivore y Omnivore
public class Bear implements Herbivore, Omnivore{

    //Se implementa el método eatPlants() tanto de la interfaz
    //Herbivore y Omnivore, ya que ambos tienen la firma firma.
    /*public void eatPlants() {
        System.out.println("Eating meat");
    }*/
    //Se implementa el método eatMeat() de la interfaz Omnivore
    public void eatMeat() {
        System.out.println("Eating plants");
    }

    //Se tiene que implementar el método eatPlants(int quantity) de la
    //interfaz Herbivore. Ya que, el compilador lo toma como diferente de
    //del método eatPlants() de Omnivore
    public int eatPlants(int quantity) {
        return 0;
    }

    //Ambos métodos no compilan porque la firma del método es igual.
    //A pesar de que retornan diferentes valores
    /*public int eatPlants(){
        System.out.println("Eating plants: 10");
        return 10;
    }

    public void eatPlants(){
        System.out.println("Eating plans");
    }*/
}
