package ids_bootcamp.java.chapter_05_class_design.d11.implementing_interfaces;

//Estrcutura
//public(opcional): Modificador de acceso
//abstract(Asumido):
//interface(obligatorio): Palabra clave de interfaz
//CanBurrow: Nombre de la interfaz

public abstract interface CanBurrow {

    //Variable  tipo int, con acceso público
    public static final int MINIMUM_DEPTH = 2;

    //Método abstracto con acceso público (se asume) con un valor de retorno de int
    public abstract int getMaximumDepth();
}
