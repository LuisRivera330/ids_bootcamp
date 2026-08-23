package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.creating_objects.reading_and_writing_object_fields;

public class Swan {
    int numberEggs; // instance variable
    public static void main (String[] args){
        Swan mother = new Swan();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // read variable
    }
}
