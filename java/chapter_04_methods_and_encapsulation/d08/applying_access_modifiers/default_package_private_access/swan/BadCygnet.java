package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.default_package_private_access.swan;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.default_package_private_access.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        //duck.quack(); // No compila porque el método quack es de tipo 'default' esto quiere decir que solo puede acceder a el método que están en el mismo paquete
        //System.out.println(duck.noise); // De la misma manera con el atribuito noise. Solo pueden acceder clases que esten en el mismo paquete
    } }