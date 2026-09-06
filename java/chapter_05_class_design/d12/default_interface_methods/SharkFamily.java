package ids_bootcamp.java.chapter_05_class_design.d12.default_interface_methods;

//La interfaz SharkFamily extiende de la interfaz HasFins
public interface SharkFamily extends HasFins{
    //Reemplaza el método getNumberOfFins y retorna un valo diferente
    public default int getNumberOfFins(){
        return 8;
    }

    //Reemplaza el método predeterminado getLongestFinLength de la interfaz HasFins por uno abstracto
    public double getLongestFinLength();

    //Genera un error de compilación ya que, si bien redefine el método
    //doFinsHaveScales no coloca la palabra default
    /*public boolean doFinsHaveScales(){
        return false;
    }*/
}
