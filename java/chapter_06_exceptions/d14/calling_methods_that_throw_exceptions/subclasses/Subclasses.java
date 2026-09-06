package ids_bootcamp.java.chapter_06_exceptions.d14.calling_methods_that_throw_exceptions.subclasses;

class CanNotHopException extends Exception { }

/*class Hopper {
    public void hop() { }
}

class Bunny extends Hopper {
    // No compila porque, Java sabe que el método hop() no puede lanzar excepciones verificadas
    // porque la superclase Hopper no declara ninguna
    //public void hop() throws CanNotHopException { }
}*/

//Ojo: Una subclase puede declarar menos excepciones que la superclase o interfaz

/*class Hopper {
    public void hop() throws CanNotHopException { }
}
//El siguiente caso es válido ya que, una subclase que no declara una excepción es similar a
// un método que declara lanzar una excepción que en realidad nunca lanza
class Bunny extends Hopper {
    public void hop() { }
}*/

//De la misma manera, este caso es válido
//ya que, el método hop de la subclase Bunny lanza una excepción más específica que el método hop()
/*class Hopper {
    public void hop() throws Exception { }
}
class Bunny extends Hopper {
    public void hop() throws CanNotHopException { }
}*/

//El caso es válido ya que, se puede declarar nuevas excepciones de tiempo de ejecución en subclases
//aunque es redundante ya que, se pueden lanzar cualquier excepción de tiempo de ejecución
/*class Hopper {
    public void hop() { }
}

class Bunny extends Hopper {
    public void hop() throws IllegalStateException { }
}*/