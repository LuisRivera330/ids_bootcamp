package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.overriding_vs_hiding_methods;

//Se hereda la clase Marsupial
public class Kangaroo extends Marsupial {
    //Se oculta el método isBiped() ya que, es static, es decir método de clase
    //Retorna un true
    /*public static boolean isBiped() {
        return true;
    }
    //Se crea el método getKangarooDescription. No devuelve nada. Pero imprime un valor dentro
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    //Se instancia un objeto de la clase Kangaroo
    //Se imprime el método getMarsupialDescription de la clase padre
    //y el método getKangarooDescription de la clase Kangaroo
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }*/
    //Resultado:
    //Marsupial walks on two legs: false
    //Kangaroo hops on two legs: true

    //Se sobreescribe no se oculta ya que, ahora es un método de instancia
    //Retorna true
    public boolean isBiped() {
        return true;
    }
    //Se crea el método getKangarooDescription. No devuelve nada. Pero imprime un valor dentro
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    //Se instancia un objeto de la clase Kangaroo
    //Se imprime el método getMarsupialDescription de la clase padre
    //y el método getKangarooDescription de la clase Kangaroo
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
    //Resultado: Hay una variación ya que, el método isBiped ya no se oculta sino se sobreescribe, al ser un método de instancia
    //Marsupial walks on two legs: true
    //Kangaroo hops on two legs: true
}