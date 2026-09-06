package ids_bootcamp.java.chapter_06_exceptions.d13.using_a_try_statement.adding_a_finally_block;

public class AddingAFinallyBlock {

    //Estructura:
    //finally: Solo puede aparecer en el bloque try/catch
    //finally: Siempre se va ejecutar. Ya sea si el código se mantiene en try o pasa a catch
    /*try{

    }catch{

    }finally{

    }*/


    //1. Se ejecuta el método seeAnimals();
    //2. Continua el método fall(). Este último lanza una excepción
    //3. Pasa el bloque catch.
    //4. Se ejecuta el método getHugFromDaddy()
    //5. Luego, se ejecuta de todos modos seeMoreAnimals()
    //6. Finalmente, se invoca el método goHome()
    /*void explore() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }*/

    //Primer caso:
    /*try { // No compila porque, los bloques finally y catch están en el orden incorrecto
        fall();
    } finally {
        System.out.println("all better");
    } catch (Exception e) {
        System.out.println("get up");
    }*/


    //Segundo caso:
    /*try { // No compila porque, falta el bloque catch o finally
        fall();
    }*/


    //Tercer caso:
    //Compila sin problemas ya que no es necesario el bloque catch si hay un finally
    /*try {
        fall();
    }finally {
        System.out.println("all better");
    }*/


    public static void main(String[] args) {
        //Se inicializa una variable String con una cadena vacía
        String s = "";
        //Se ejecuta el bloque try. Agrega el caracter t a la variable s. Como no se lanza una excepción se salta el bloque catch
        //Se ejecuta el bloque finall. Agrega el caracter f a la variable s
        //Sale del bloque try/catch. Se agrega el caracter a a la variable s
        //Se imprime el resultado:tfa
        try {
            s += "t";
        } catch(Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.print(s);
    }
}
