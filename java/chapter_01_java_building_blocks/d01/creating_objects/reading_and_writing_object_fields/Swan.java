package ids_bootcamp.java.chapter_01_java_building_blocks.d01.creating_objects.reading_and_writing_object_fields;

public class Swan {
    int numberEggs; // instance variable de tipo int
    public static void main (String[] args){
        //Se crea un objeto de tipo Swan
        Swan mother = new Swan();
        mother.numberEggs = 1; // Se setea el atributo numberEgg a 1
        System.out.println(mother.numberEggs); // Se imprime el valor de la variable
    }
}
