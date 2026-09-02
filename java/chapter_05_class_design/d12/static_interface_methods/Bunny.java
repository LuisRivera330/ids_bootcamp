package ids_bootcamp.java.chapter_05_class_design.d12.static_interface_methods;

//La clase Bunny implementa de Hop
public class Bunny implements Hop{
    public void printDetails(){
        //System.out.println(getJumHeight());//No compila porque, no se coloca explicitamente el nombre de la interfaz antes del método
    }
}
