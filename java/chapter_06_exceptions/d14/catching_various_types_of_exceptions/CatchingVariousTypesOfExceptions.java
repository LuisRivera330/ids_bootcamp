package ids_bootcamp.java.chapter_06_exceptions.d14.catching_various_types_of_exceptions;

public class CatchingVariousTypesOfExceptions {
    //Se declara 3 excepciones no verificadas, que extienden directa o indirectamente, de RuntimeException
    class AnimalsOutForAWalk extends RuntimeException { }
    class ExhibitClosed extends RuntimeException { }
    class ExhibitClosedForLunch extends ExhibitClosed { }

    public static void main(String[] args) {
        //Se crea una estructura try/catch.
        //1. Entra al try. Si seeAnimal() no produce ningún error no imprime nada
        //2. Si el animal esta paseando. Se ejecuta el primer bloque catch. Imprime "try back later"
        //3. Si la exhibición está cerrada. Se ejecuta el segundo bloque catch. Imprime "not today"
        //Ojo: El bloque catch se ejecuta según el orden escrito
        /*try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        }*/


    }

    //1. Se ejecuta el método seeAnimal(). Si hay un error se ejecuta el primer catch
    //2. ExhibitClosedForLunch es la excepción de una subclase. Más específica
    //3. Si en caso el problema no es respecto al primer catch. Se ejecuta el segundo ExhibitClosed (error de una superclase)
    /*public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }*/

    /*public void visitMonkeys() {
        try {
            //seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
            // No compila porque, si se lanza la excepción ExhibitClosedForLunch, ExhibitClosed lo atrapará.
            //Ya que es superclase de ExhibitClosedForLunch. Eso significa que nunca se ejecutará ExhibitClosedForLunch
            //Java indica que hay un bloque catch inalcanzable
        } catch (ExhibitClosedForLunch e) {
            System.out.print("try back later");
        }
    }*/

    /*public void visitSnakes() {
        try {
            //seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        } catch (ExhibitClosed e) {// No compila porque, nunca va llegar a ExhibitClosed ya que este último es subclase de RuntimeException
            System.out.print("not today");
        } catch (Exception e) {
            System.out.print("exception");
        }
    }*/


}

