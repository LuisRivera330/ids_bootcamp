package java_core.java_core.java_core.chapter_01_java_building_blocks.d02.destroying_objects.finalize;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {

    /*protected void finalize(){
        System.out.println("Calling Finalize");
    }
    public static void main(String[] args){
        Finalizer f = new Finalizer();
    }*/

    private static List objects = new ArrayList();
    protected void finalize() {
        objects.add(this); // Don't do this
    }

}
