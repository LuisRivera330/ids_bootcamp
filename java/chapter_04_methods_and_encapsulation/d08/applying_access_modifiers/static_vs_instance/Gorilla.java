package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.static_vs_instance;

public class Gorilla {

//Hasta la línea 21 el código es correcto, ya que tanto el método addGorilla (método de instancia) y babyGorilla (método estático)
//pueden hacer referencia a la variable count (estática). Asimismo, un método de instancia (announceBabies) puede
//llamar a un método estático y de instancia (addGorilla y babyGorilla)

public static int count;

public static void addGorilla() {
    count++;
}
public void babyGorilla() {
    count++;

}
public void announceBabies() {
    addGorilla();
    babyGorilla();
}

//En el método announceBabiesToEveryone, la invocación del método babyGorilla() no compila,
//porque un método estático no puede llamar a un método de instancia.
public static void announceBabiesToEveryone() {
        addGorilla();
        //babyGorilla();
        }
public int total;

//De la misma manera la línea 32 no compila porque, una variable estática intenta usar una variable de instancia.
//public static average = total / count; }
}