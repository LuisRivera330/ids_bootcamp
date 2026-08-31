package ids_bootcamp.java.chapter_03_core_java_apis.d07.designing_methods.access_modifiers;

public class AccessModifiers {
    //public: El método puede ser llamado desde cualquier clase.
    //private: El método solo puede ser llamado desde dentro de la misma clase.
    //protected: El método solo puede ser llamado desde clases del mismo paquete o subclases.
    //Default: El método solo puede ser llamado desde clases del mismo paquete.


    public void walk1() {} //Es una declaración válida porque, la estructura del método está en un orden correcto. Primero el acceso luego el tipo de retorno
    //default void walk2() {} // No compila porque, para hacer referencia al tipo de accesso por 'default' no hay necesidad de escribir este último nombre textualmente
    //void public walk3() {} //No compila porque, el orden está en un orden incorrecto. Porque el modificador de acceso se especifica después del tipo de retorno.
    void walk4() {}// Es una declaración de método válida con acceso predeterminado, es decir 'default'

}
