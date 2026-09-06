package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.default_package_private_access;

public class GoodDuckling {
    public void makeNoise() {
        //Se instancia un objecto de la clase MotherDuck
        ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.default_package_private_access.MotherDuck duck = new ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.default_package_private_access.MotherDuck();
        duck.quack(); //El método quack de MotherDuck compila con normalidad porque están en el mismo paquete, ya que su acceso es por 'default'
        System.out.println(duck.noise); // Lo mismo sucede con el atributo noise. Se puede acceder con normalidad porque están en el mismo paquete
    } }
