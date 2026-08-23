package java_core.java_core.java_core.chapter_01_java_building_blocks.d01.understanding_java_class_structure.fields_and_methods;

public class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int numberVisitors(int month) {
        return month + 1;
    }
}