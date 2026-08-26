package java_core.java_core.java_core.chapter_03_core_java_apis.d05.undertanding_java_arrays.creating_an_array_of_primitives;

public class CreatingAnArrayOfPrimitves {

    public static void main(String[] args) {
        //Se define un array de tipo int con un tamaño de 3
        //Es la forma más común de escribir
        int[] numbers1 = new int[3];
        System.out.println(numbers1[1]);

        //Otra manera de declarar un array pero con valores determinados
        int[] numbers2 = new int[] {42, 55, 99};

        //Una manerea más sintetizada
        int[] numbers3 = {42, 55, 99};

        //Se declara un array anónimo
        //Se puede escribir [] antes o después del nombre
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        //Mútiples arrays en una declaración
        //crea dos variables de tipo array int[]
        int ids[], types;

        //En ese caso varia el resultado
        //Se crea una variable de tipo int[] y otra de tipo int
        int ids2[], types2;
    }


}
