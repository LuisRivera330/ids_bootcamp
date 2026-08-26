package ids_bootcamp.java.chapter_02_operators_and_statements.d04.understanding_advanced_flow_control.nested_loops;

public class NestedLoops {
    public static void main(String[] args) {

        //Ejemplo 01:
        //Se declara un arreglo bidimensional
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        //Se crea un bucle for-each. El cual recorre el arreglo bidimensional
        for(int[] mySimpleArray : myComplexArray) {
            //Se crea un bucle for simple, el cual se encuentra anidado dentro del for-each
            //El inicializador empieza con 0
            //La condición indica que el bucle se ejecutará hasta que la longitud de array en ese momento sea mayor que i
            //i incrementará su valor en una unidad
            for(int i=0; i<mySimpleArray.length; i++) {
                //Se imprime cada elemento de cada array. Dejando una tabulación
                System.out.print(mySimpleArray[i]+"\t");
            }
            //Se imprime un salto de línea
            System.out.println();
        }

        //Ejemplo 02:
        //Se crea una variable de tipo int con un valor inicial de 20
        int x = 20;
        //Se crea un bucle while. La condición indica que mientras x sea mayor que 0 se ejecutará
        while(x>0) {
            //Se crea el bucle anidado do-while. La cual garantiza al menos una ejecución
            do {
                //El valor de x se reduce de 2 en 2
                x -= 2;
                //Mientras x sea mayor que 5
            } while (x>5);
            //Luego se resta una unidad más a x
            x--;
            //Se imprime el valor de 3 y 0
            System.out.print(x+"\t");
        }
    }
}
