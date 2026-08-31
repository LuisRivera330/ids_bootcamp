package ids_bootcamp.java.chapter_04_methods_and_encapsulation.overloading_methods.reference_type;

public class ReferenceTypes {

    //El resultado final: string object
    //Ya que La primera llamada es de tipo String y encuentra una coincidencia directa
    //No hay razón para usar la versión de objeto cuando existe una lista de parámetros de tipo String
    //La segunda llamada busca una lista de parámetros de tipo int
    //Al no encontrarla,la convierte automáticamente a Integer
    //Como no encuentra coincidencia recurre a la versión de tipo Object.
    public void fly(String s) {
        System.out.print("string ");
    }
    public void fly(Object o) {
        System.out.print("object ");
    }
    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(56);
    }
}
