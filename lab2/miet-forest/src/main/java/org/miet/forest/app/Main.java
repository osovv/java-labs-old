package main.java.org.miet.forest.app;

import main.java.org.miet.forest.model.*;
import main.java.org.miet.forest.model.animals.Pig;
import main.java.org.miet.forest.model.animals.Wolf;
import main.java.org.miet.forest.model.base.Animal;
import main.java.org.miet.forest.model.base.Plant;
import main.java.org.miet.forest.model.plants.Corn;
import main.java.org.miet.forest.model.types.AnimalSize;

public class Main {
    public static void main(String[] args) {
        Animal wolf = new Wolf(AnimalSize.LARGE);
        Animal pig = new Pig(AnimalSize.SMALL);
        Plant corn = new Corn();

        System.out.println(String.format("Wolf can eat pig: %s", wolf.canEat(pig)));
        System.out.println(String.format("Wolf can eat corn: %s", wolf.canEat(corn)));
        System.out.println(String.format("Pig can eat wolf: %s", pig.canEat(wolf)));
        System.out.println(String.format("Pig can eat corn: %s", pig.canEat(corn)));
        System.out.println(String.format("Corn can eat wolf: %s", corn.canEat(wolf)));
        System.out.println(String.format("Wolf can eat self: %s", wolf.canEat(wolf)));

        Forest forest = new Forest(10);
        System.out.println(forest);
        wolf.findFood(forest.getInhabitants());
    }
}
