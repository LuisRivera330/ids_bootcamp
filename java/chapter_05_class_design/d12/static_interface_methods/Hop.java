package ids_bootcamp.java.chapter_05_class_design.d12.static_interface_methods;

public interface Hop {
    //Se crea un método estático en la interfaz Hop
    //Su uso es similar al de una clase. Esto quiere decir
    //que no necesitamos una instancia. Asimismo, se insertará automáticamente el acceso public
    static int getJumpHeight(){
        return 8;
    }
}
