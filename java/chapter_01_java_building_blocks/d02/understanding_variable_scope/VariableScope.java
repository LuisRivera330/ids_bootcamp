package ids_bootcamp.java.chapter_01_java_building_blocks.d02.understanding_variable_scope;

public class VariableScope {
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    } //Hay dos variables locales. Se declaran dentro del método lo que significa que no pueden existir fuera

    /*public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        }
        System.out.println(bitesOfCheese);//No compila porque sale del scope de la estructura if -- Variable local
    }*/

    /*public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        //System.out.println(teenyBit); // No compila porque sale del scope de la estructura if -- Variable local
    }*/

    //hungry, amountOfFood y room InBelly estan disponibles durante todo el método
    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        //timeToEat esta disponible hasta el final del bloque if
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0) {
                //amountEaten esta disponible hasta el final del blucle while
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}

