package ids_bootcamp.java.chapter_05_class_design.d12.default_interface_methods;

public interface IsWarmBlooded {
    //Se crean dos métodos en la interfaz IsWarmBlooded
    //El primer método es abstracto ya que,
    // no se define su contenido. Además no tiene {}, por lo tanto no tiene cuerpo
    boolean hasScales();

    //El segundo es un método predeterminado ya que tiene la palabra reservada default
    //Entonces, se puede afirmar que las clases que implementen IsWarmBlooded
    //no están en la obligación de sobreescribir el método
    public default double getTemperature(){
        return 10.0;
    }
}
