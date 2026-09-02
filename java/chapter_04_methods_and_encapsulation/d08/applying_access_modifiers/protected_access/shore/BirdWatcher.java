package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.shore;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // No generar error al invocar el método floatInWater() porqu,e están el mismo paquete, a pesar de heredar de Bird
        System.out.println(bird.text); // Lo mismo con el atributo text, al ser de tipo 'protected' no genera error, ya que están en el mismo paquete
    }
}
