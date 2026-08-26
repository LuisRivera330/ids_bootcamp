package java_core.java_core.java_core.chapter_03_core_java_apis.d05.understanding_equality;

public class Tiger {
    String name;

    public static void main(String[] args) {
        //Se declaran dos objetos de tipo Tiger
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        //t3 hace referencia a t1
        Tiger t3 = t1;
        //t1 es igual a t1 porque practicamente es el mismo objeto
        System.out.println(t1 == t1); // true
        //Es falso porque hace referencia a otro objeto
        System.out.println(t1 == t2); // false
        //Es falso porque no implementa el método equals
        System.out.println(t1.equals(t2)); // false
    }
}
