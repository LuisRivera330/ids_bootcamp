package ids_bootcamp.java.chapter_04_methods_and_encapsulation.overloading_methods;

public class OverloadingMethods {
    //Los siguiente métodos a pesar de tener el mismo nombre son compatibles porque, tienen diferentes tipos de parámetros
    //En algunos casos tiene la misma cantidad de parámetros pero se diferencia porque son de diferente tipo
    //Ojo: Para la sobrecarga de métodos el modificador de acceso y la lista de excepciones son irrelevantes
    /*public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }*/

    //public void fly(int numMiles) { }
    //public int fly(int numMiles) { } //No compila porque, la firma del método es identica. El tipo de retorno es irrelevante

    //public void fly(int numMiles) { }
    //public static void fly(int numMiles) { } // No compila porque la firma del método es identica. La única diferencia es que uno es un método de instancia y el otro es un método estático.

    //Para llamar un método solo se escribe el nombre que deseamos y el tipo de parámetro
    //Ejemplo: fly((short) 1) imprime short
    public void fly(int numMiles) {
        System.out.println("short");
    }
    public void fly(short numFeet) {
        System.out.println("short");
    }


}
