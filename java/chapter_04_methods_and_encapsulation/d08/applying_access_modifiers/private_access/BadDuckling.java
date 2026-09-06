package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.private_access;

public class BadDuckling {
    public void makeNoise() {
        //Se instancia un objecto de la clase FatherDuck
        FatherDuck duck = new FatherDuck();
        //duck.quack(); // No compila porque BadDuckling está intentando acceder a miembros a los que no debería tener acceso.
        //System.out.println(duck.noise); // No compila porque intenta acceder a una variable de instancia privada de otra clase.
    }
}
