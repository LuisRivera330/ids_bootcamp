package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.overriding_vs_hiding_methods;

public class Marsupial {
    //Se crea un método estático que duelve un valor booleano
    //En este metodo retorna false
    /*public static boolean isBiped() {
        return false;
    }
    //Se crea un método de instancia que no duelve nada
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }*/

    //Se crea una variable de instancia no de clase. Retona un valor booleano
    public boolean isBiped() {
        return false;
    }
    //Se crea un método de instancia que no duelve nada
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
