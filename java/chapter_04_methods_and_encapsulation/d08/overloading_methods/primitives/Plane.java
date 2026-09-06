package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.overloading_methods.primitives;

public class Plane {
    //Resultado final: int long
    //La primera llamada p.fly(123) pasa un `int` y encuentra una coincidencia exacta.
    //La segunda llamada pasa un `long` y también encuentra una coincidencia exacta
    //Ojo: Si comentamos el método sobrecargado con la lista de parámetros `int`, la salida se convierte en `long long`
    //Java llama a un tipo primitivo más grande
    //Sin embargo, no lo hará a menos que no encuentre una mejor coincidencia
    public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }
    public static void main(String[] args) {
        Plane p = new Plane();
        p.fly(123);
        p.fly(123L);
    } }
