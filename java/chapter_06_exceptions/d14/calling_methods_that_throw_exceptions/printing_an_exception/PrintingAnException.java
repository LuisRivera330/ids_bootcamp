package ids_bootcamp.java.chapter_06_exceptions.d14.calling_methods_that_throw_exceptions.printing_an_exception;

public class PrintingAnException {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
    //1.Se crea un bloque try/catch
    //2. Se invoca al método hop
    //3. El método lanza un error RuntimeException con un mensaje
    //4. El bloque catch atrapa ese error. E imprime el tipo de error junto al mensaje
    //5. Luego, se imprime únicamente el mensaje
    //6. Se imprime el rastreo del error. Las líneas donde se produce el error

    //Resultado:
    //java.lang.RuntimeException: cannot hop
    //cannot hop
    //java.lang.RuntimeException: cannot hop
    //at ids_bootcamp.java.chapter_06_exceptions.d14.calling_methods_that_throw_exceptions.printing_an_exception.PrintingAnException.hop(PrintingAnException.java:15)
    //at ids_bootcamp.java.chapter_06_exceptions.d14.calling_methods_that_throw_exceptions.printing_an_exception.PrintingAnException.main(PrintingAnException.java:6)
}
