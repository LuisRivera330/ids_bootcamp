package java_core.java_core.java_core.chapter_03_core_java_apis.understanding_java_arrays.creating_an_array_of_primitives.using_an_array;

public class UsingArray {
    public static void main(String[] args) {
        //Se declara e inicializa el array con elementos de tipo String
        String[] mammals = {"monkey", "chimp", "donkey"};
        //La siguiente función indica cuantos elementos puede tener el array
        System.out.println(mammals.length); // 3
        //Se realiza la búsqueda de cada elemento en una ubicación específica
        //Recuerda que el index siempre inicia en 0
        System.out.println(mammals[0]); //Resultado: monkey
        System.out.println(mammals[1]); //Resultado: chimp
        System.out.println(mammals[2]); //Resultado: donkey


        //La longitud del siguiente array son 6.
        //A pesar que no tiene elementos por defecto estos toman el valor de nulo
        String[] birds = new String[6];
        System.out.println(birds.length);

        //Instancia un array de tipo int con 10 posiciones
        int[] numbers = new int[10];
        //Se declara un bucle for simple
        //Su inicializador comienza con un valor de 0
        //Se llega iterar el bucle mientras la longitud del array sea mayor a i
        //Se incrementa el valor de i en una unidad en cada iteración
        for (int i = 0; i < numbers.length; i++)
            //Se guarda cada elemento
            numbers[i] = i + 5;

        //La siguiente declaración genera un error, porque la ubicación máximo que tenemos es de 9.
        //Es decir longitud 10
        numbers[10] = 3;
        numbers[numbers.length] = 5;
        //El bucle for parece correcto. Sin embargo, está mal porque se esta usando <= lo cual supuestamente indica que se puede llenar
        // hasta el 11vo valor
        for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;
    }

}
