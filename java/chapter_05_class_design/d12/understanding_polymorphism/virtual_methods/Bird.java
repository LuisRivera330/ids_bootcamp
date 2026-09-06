package ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.virtual_methods;

public class Bird {
    //Se crea un método de instancia que retorna un valor de String
    public String getName(){
        return "Unknown";
    }

    //Se crea un método de instancia. No retorna nada.
    //Pero imprime un valor
    public void displayInformation(){
        System.out.println("The bird name is: "+getName());
    }
}
