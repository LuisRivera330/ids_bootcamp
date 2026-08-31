package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.goose;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.shore.Bird;

public class Gosling extends Bird { // La palabra "extends" significa crear una subclase. Es decir, hereda de la clase Bird sus métodos y atributos
    public void swim() {
        floatInWater(); // Llama al método floatInWater que se encuentra en Bird. No genera error ya que, el método tiene acceso de tipo "protected"
        System.out.println(text); // Imprime el atributo text de Bird ya que, de la misma forma, su acceso es "protected"
        //Resultado: se imprime dos veces "floating". Uno por el método y otro por la invocación del método floatInWater
        //Recordar: En el acceso 'protected' se puede acceder a métodos y atributos de clase padre a pesar de estar en paquetes diferentes
        //Asimismo, nos da acceso a todo lo que permite el acceso predeterminado
    }
}
