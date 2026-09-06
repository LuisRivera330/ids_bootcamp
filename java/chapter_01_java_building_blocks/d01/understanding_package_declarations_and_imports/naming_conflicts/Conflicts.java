package ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.naming_conflicts;

//import java.util.*;
//import java.sql.*; // Date no hace caso a la importación porque Date se encuentra en varios paquetes. Hay una ambiguedad

//Se hace el llamado a la clase de Date de la librería util
import java.util.Date;
import java.sql.*;

//import java.util.Date;
//import java.sql.Date;

public class Conflicts {
    //Podemos ser específicos utilizando java.sql.Date
    //Si en caso queremos implementar los dos tipos de date
    Date date;

    java.sql.Date sqlDate;

}

    class Conflict {
    java.util.Date date;
    java.sql.Date sqlDate;
}
