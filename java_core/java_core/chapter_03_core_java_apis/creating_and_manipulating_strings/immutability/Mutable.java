package java_core.java_core.java_core.chapter_03_core_java_apis.creating_and_manipulating_strings.immutability;

class Mutable {
    private String s;
    public void setS(String newS){ s = newS; } // Permite modificar el estado del atributo
    public String getS() { return s; }

    public static void main(String[] args) {
        //Se concatena s1 y s2. Imprimiendo un valor de 12
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}
//Hace que la clase Immutable no pueda ser heredada
final class Immutable {
    //Crea un atributo de tipo private, es decir otra clase no puede acceder a ella
    //Asimismo, no se puede modificar
    private String s = "name";
    //El método getS solo permite permite leer el valor
    public String getS() { return s; }
}


