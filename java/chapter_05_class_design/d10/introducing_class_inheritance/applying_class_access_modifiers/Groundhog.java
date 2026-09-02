package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.applying_class_access_modifiers;

//Un archivo Java puede tener muchas clases, pero como máximo una clase pública
//En este caso Groundhog está heredando de Rodent
//Si actualizáramos la clase Rodent con el modificador de acceso público, el archivo Groundhog.java no compilaría
class Rodent {}

public class Groundhog extends Rodent {}
