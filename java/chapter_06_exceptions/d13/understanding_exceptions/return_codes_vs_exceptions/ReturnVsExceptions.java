package ids_bootcamp.java.chapter_06_exceptions.d13.understanding_exceptions.return_codes_vs_exceptions;

public class ReturnVsExceptions extends  Object {
    //Se crea un método que devuelve un valor de tipo int.
    //Los parámetros que tiene son: tipo array y String
    //Se realiza la búsqueda del nombre colocado en el array
    //Si se llega encontrar se retorna la ubicación del nombre
    //Caso contrario se retorna -1
    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i; }
        }
        return -1;
    }

}
