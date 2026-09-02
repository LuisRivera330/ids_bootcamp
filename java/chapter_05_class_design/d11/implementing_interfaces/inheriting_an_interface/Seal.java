package ids_bootcamp.java.chapter_05_class_design.d11_creating_abstract_classes.inheriting_an_interface;

//La intefaz Seal extiende de la interfaz  HasTail y HasWhiskers
//Esto quiere decir que cualquier clase que implemente la interface
//Seal deberá también implementar los métodos getTailLength() y getNumberOfWhiskers()
public interface Seal extends HasTail, HasWhiskers{
}
