package ids_bootcamp.java.chapter_04_methods_and_encapsulation.passing_data_among_methods;

public class ReturningValues {
    public static void main(String[] args) {
        //Se asigna valores a las variables de number (1) y letters (abc)
        int number = 1;
        String letters = "abc"; //abc
        //Se invoca al método 'number', Y se pasa como parámetro la variable 'number'
        number(number); //El resultado que se devuelve es 2. Pero como no se reasgina a una varible se ignora
        letters = letters(letters); //El resultado es abcd. En este caso es diferente porque se reasgina el valor a la variabla letters
        System.out.println(number + letters); //Resultado final: 1abcd
    }

    //Se crea el método number que tiene un retorno de tipo int.
    public static int number(int number) {
        //Se incrementa en una unidad el parámetro number
        number++;
        //Se retorna el valor
        return number;
    }

    //Se crea el método letter que tiene un retorno de tipo String
    public static String letters(String letters) {
        //Se agrega y reasgina el valor a la variable letters
        letters += "d";
        return letters;
    }
}
