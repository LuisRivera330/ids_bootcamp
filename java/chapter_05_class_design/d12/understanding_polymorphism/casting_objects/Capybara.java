package ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.casting_objects;

public class Capybara extends Rodent {
    public static void main(String[] args) {
        //Se crea una instancia del objeto Rodent
        //Rodent rodent = new Rodent();
        Rodent rodent = new Rodent();
        //Se intenta convertir una subclse Rodent a capybara
        //No genera un error de compilación pero si de ejecución.
        //ya que, al objeto que se hace referencia no es una instancia de la clase Capybara
        Capybara capybara = (Capybara) rodent;

        //Para evitar problemas de ClassCastException se puede utilizar instanceof
        /*f(rodent instanceof Capybara){
            Capybara capybara = (Capybara) rodent;
        }*/
    }
}
