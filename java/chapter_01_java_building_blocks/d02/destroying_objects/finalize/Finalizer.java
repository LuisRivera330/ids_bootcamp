package ids_bootcamp.java.chapter_01_java_building_blocks.d02.destroying_objects.finalize;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {

    //Java permite que los objetos implementen un método llamado `finalize()`
    /*protected void finalize(){
        System.out.println("Calling Finalize");
    }
    public static void main(String[] args){
        Finalizer f = new Finalizer();
    }*/

    private static List objects = new ArrayList();
    //Llama al recolector de basura
    //finalize solo se puede ejecutar cero o una vez
    protected void finalize() {
        objects.add(this);
    }

}
