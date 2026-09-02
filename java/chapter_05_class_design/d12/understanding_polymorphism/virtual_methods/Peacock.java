package ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.virtual_methods;

//La clase Peacock hereda de Bird
public class Peacock extends Bird{
    //Se sobreescribe el método getName() de la clase padre Bird
    public String getName(){
        return "Peacok";
    }

    public static void main(String[] args) {
        //Se crea un objeto Peacock que hace referencia a la clase Bird
        Bird bird = new Peacock();
        //Se invoca el método displayInformation()
        bird.displayInformation();
        //Se imprime Peacok ya que, la variable bird es un objeto de la clase Peack,
        //donde getName() está sobreescrito
        //Asimismo, getName() en tiempo de ejecución, dentro de displayInformation() se reemplaza
        //Resultado: The bird name is: Peacok
    }
}
