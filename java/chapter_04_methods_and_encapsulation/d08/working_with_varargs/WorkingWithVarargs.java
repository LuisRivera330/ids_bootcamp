package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.working_with_varargs;

public class WorkingWithVarargs {
    //vararg -- argumento variable
    //vararg debe ser el último elemento de la lista de parámetros del método.

    public void walk1(int... nums) { }//Es una declaración de método válida con un parámetro variable
    public void walk2(int start, int... nums) { }//Es una declaración de método válida con un parámetro entero(int) y un parámetro variable
    //public void walk3(int... nums, int start) { } // No compila porque tienen un parámetro variable en una posición que no es la última.
    //public void walk4(int... start, int... nums) { } //  No compila porque solo se puede tener un parámetro variable.



    /*public static void main(String[] args) {
        walk(1); // Pasa 1 como valor inicial. Esto significa que Java crea un array de longitud 0 para `nums`. Resultado: 0
        walk(1, 2); //Pasa 1 como valor inicial y otro valor de tipo int. Java convierte este valor en un array de longitud 1. Resultado: 1
        walk(1, 2, 3); //Pasa 1 como valor inicial y dos valores más (tipo int). Java convierte estos dos valores en un array de longitud 2. Resultado: 2
        walk(1, new int[] {4, 5}); //Pasa 1 como valor inicial y un array de longitud 2 directamente como `nums`.Resultado: 2
        walk(1, null); // Es posible pasar null explícitamente. Pero  el método walk() lanza una excepción porque intenta determinar la longitud de null.
    }*/

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    //llama a un parámetro vararg con dos parámetros.
    // Cuando se llama al método, este encuentra un array de tamaño 2.
    // Como los índices comienzan en 0, se imprime 22.
    public static void main(String[] args) {
        run(11, 22); //Resultado: 22
    }

    public static void run(int... nums) {
        System.out.println(nums[1]);
        }



}
