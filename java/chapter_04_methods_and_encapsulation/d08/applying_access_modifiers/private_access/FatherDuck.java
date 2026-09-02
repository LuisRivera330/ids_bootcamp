package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.private_access;

//Private: Solo accesible dentro de la misma clase
public class FatherDuck {
    private String noise = "quack";

    //Este código está bien porque todo pertenece a la misma clase.
    //En este ejemplo se crea dos métodos de acceso private.
    //El método quack imprime la variable noise (también es de acceso private)
    //Luego este método es invocado por el método makeNoise
    private void quack() {
        System.out.println(noise); //
    }

    private void makeNoise() {
        quack();
        }


}
