package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.encapsulating_data;

public class Swan {
    //int numberEggs; //Variable de instancia. Es decir, se debe crear un objeto para poder utilizarla

    //mother.numberEggs = -1; //Dado que el acceso es predeterminado. Significa que cualquier clase del paquete puede establecer 'numberEggs'
    private int numberEggs; //Se crea un atributo de tipo private, es decir solo los métodos y atributos de la misma clase pueden acceder a él

    //Se crea el método getNumberEggs de tipo público que retorna el valor de numberEggs, es decir un int
    public int getNumberEggs() {
        return numberEggs;
    }

    //Se crea el método de tipo público, no retorna ningún valor.
    // Pero, solo setea la variable de instancia numberEggs si el valor ingresado es mayor o igual a 0
    public void setNumberEggs(int numberEggs) {
        if (numberEggs >= 0)
            //Se usa la palabra this que hace referencia a la variable de instancia numberEggs
            this.numberEggs = numberEggs;
    }
    //Ojo: Para la encapsulación, recuerde que una variable de instancia es privada y los métodos getter/setter
    //son públicos.

    //Se instancia dos variables de clase. Una de tipo boolean y otra de tipo String
    //Son variables de instancia privadas.
    private boolean playing;
    private String name;

    public boolean getPlaying() { return playing; } //No sigue las convenciones de nomenclatura de JavaBeans ya que, al ser un booleano el método getter debe comenzar con 'is'.
    public boolean isPlaying() { return playing; } //Sigue la convencion de nomenclatura de JavaBeans ya que, al ser un boolean el nombre del método comienza con is
    public String name() { return name; } //No sigue las convenciones de nomenclatura de JavaBeans porque debería llamarse `getName`
    //Las dos líneas siguientes no siguen las convenciones de nomenclatura de JavaBeans porque deberían llamarse 'setName'
    public void updateName(String n) { name = n; }
    public void setname(String n) { name = n; }

}
