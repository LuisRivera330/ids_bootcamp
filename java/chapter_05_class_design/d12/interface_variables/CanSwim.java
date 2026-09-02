package ids_bootcamp.java.chapter_05_class_design.d12.interface_variables;

public interface CanSwim {
    //Las siguientes definiciones de variables
    //dentro de la interfaz CanSwim son equivalentes
    //ya que, implícitamente en el primer bloque se declara un 'public static final'
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";

    /*public static final int MAXIMUM_DEPTH = 100;
    public static final boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";*/
}
