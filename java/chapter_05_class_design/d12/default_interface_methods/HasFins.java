package ids_bootcamp.java.chapter_05_class_design.d12.default_interface_methods;

public interface HasFins {
    //Se define 3 métodos predeterminados
    public default int getNumberOfFins(){
        return 4;
    }

    public default double getLongestFinLength(){
        return 20;
    }

    public default boolean doFinsHaveScales(){
        return true;
    }

}
