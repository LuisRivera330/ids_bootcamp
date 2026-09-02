package ids_bootcamp.java.chapter_01_java_building_blocks.d01.writing_a_main_method;

public class Zoo {
    //El método main es la puerta de entrada entre Java y JVM
    //nos permite integrar nuestro código en este proceso
    public static void main(String[] args) {
        //Accede al primer elemento del Array. Los índices inician en 0
        System.out.println(args[0]);
        //Accede al segundo elemento del Array.
        System.out.println(args[1]);
        //javac Zoo.java -- compila el archivo a javac Zoo.class
        //java Zoo ejecuta el programa
    }
}
