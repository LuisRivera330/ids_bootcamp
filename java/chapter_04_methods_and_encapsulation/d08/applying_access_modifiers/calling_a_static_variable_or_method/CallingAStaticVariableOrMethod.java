package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.calling_a_static_variable_or_method;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.designing_static_methods_and_fields.Koala;

public class CallingAStaticVariableOrMethod {
    //Para acceder a un miembro estático basta con anteponer el nombre de la clase al método o variable
    public static void main(String[] args) {
        //Se coloco el nombre Koala para acceder a la variable count y al método amin
        System.out.println(Koala.count);
        Koala.main(new String[0]);

        //El resultado muestra 0 dos veces.
        //Primero se instancia un objeto de la clase Koala
        Koala k = new Koala();
        System.out.println(k.count); // Imprime 0, ya que count es una variable estática
        k = null; //Se igual la variable k a nulo
        System.out.println(k.count); // Se imprime con normalidad ya que, a Java no le importa que k sea nulo. Se imprime una variable estática

        //Solo hay una variable de conteo, ya que es estática
        //Toma los valores de 4, luego 6 y finalmente 5
        //Lo demás no importa
        //El resultado final es 5.
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);
    }

}
