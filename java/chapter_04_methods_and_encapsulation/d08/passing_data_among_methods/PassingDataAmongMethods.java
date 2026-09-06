package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.passing_data_among_methods;

public class PassingDataAmongMethods {
    //Java es un lenguaje de paso por valor. Esto quiero decir que se crea una copia de la variable y el método recibe esa copia
    //Las asignaciones realizadas dentro del método no afectan a quien lo llama
    /*public static void main(String[] args) {
        //A la variable 'num' se le asigna el valor 4
        int num = 4;
        //se llama al método newNumber, el cual necesita un parámetor de entrada de tipo int
        newNumber(5);
        //La variable num nunca cambia porque no se le reasigna ningún valor.
        System.out.println(num); //Resultado:4
    }*/

    //El parámetro 'num' del método se establece en 8.
    public static void newNumber(int num) {
        num = 8;
    }

    //Al igual que el ejemplo anterior. La asignación de la variable se realiza
    //solo al parámetro del método y no afecta a quien lo llama.
    //Por lo tanto, el resultado final es Webby
    /*public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name);
    }
    public static void speak(String name) {
        name = "Sparky";
    }*/

    //Para este ejemplo el resultado es diferente porque, el método speak llama a otro método del parámetro 'append'
    //Se sigue utilizando el paso por valor. 's' es una copia del nombre de la variable. Ambos apuntan al mismo `StringBuilder`
    //por lo tanto los cambios realizados en el `StringBuilder` están disponibles para ambas referencias.
    /*public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name); // Webby
    }
    public static void speak(StringBuilder s) {
        s.append("Webby");
    }*/

    //En este ejemplo, el método swap no modifica los valores originales. Solo cambia a y b dentro del método.
    //Ya que, solo se pasa una copia a los parámetros solicitados por el método swap
    /*public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }*/
}
