package ids_bootcamp.java.chapter_05_class_design.d12.default_methods_and_multiple_inheritance;

public interface Walk {
    //Se crea un método predeterminado
    //devuelve un valor de int
    public default int getSpeed(){
        return 5;
    }
}
