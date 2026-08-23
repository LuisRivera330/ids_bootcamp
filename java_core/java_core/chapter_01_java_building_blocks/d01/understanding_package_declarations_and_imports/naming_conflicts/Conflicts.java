package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.understanding_package_declarations_and_imports.naming_conflicts;

//import java.util.*;
//import java.sql.*; // Date no hace caso a la importación porque Date se encuentra en varios paquetes

import java.util.Date;
import java.sql.*;

//import java.util.Date;
//import java.sql.Date;

public class Conflicts {
    Date date;
    java.sql.Date sqlDate;

}

    class Conflict {
    java.util.Date date;
    java.sql.Date sqlDate;
}
