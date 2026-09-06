package ids_bootcamp.java.chapter_06_exceptions.d13.using_a_try_statement;

public class UsingATryStatement {

    //Estructura:
    //try: Palabra clave
    //{}: obligatorias
    //try: Ejecuta el código con normalidad. Si se produce un error catach intentará capturarla
    //catch: Palabra clave
    //excepcion_type: Tipo de excepción que se desea capturar
    //indentifier: Identificador referente al objeto de excecpión


    /*try{

    }catch(excepcion_type indentifier){

    }*/


    //Secuencia de código:
    //1. Se llama al método fall()
    //2. El método lanza una excepción
    //3. Java salta directamente al bloque catch
    //4. Se ejecuta el método getUp
    //5. Se termina la ejecución del bloque try/catch
    //6. Continua,el flujo del programa, el siguiente método seeAnimals()
    /*void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
    seeAnimals();
    }

    void fall() { throw new RuntimeException(); }*/


    /*try // No compila porque, falta las llave del bloque try/catch  "{}"
        fall();
    catch (Exception e)
            System.out.println("get up");*/

    //Forma correcta
    /*try {
        fall();
    } catch (Exception e) {
        System.out.println("get up");
    }*/

    /*try {// No compila porque, después del bloque try no está el catch. Ojo: El propósito de try es que algo suceda si se lanza una excepción.
        fall();
    }*/
}
