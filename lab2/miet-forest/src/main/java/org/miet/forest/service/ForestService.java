package main.java.org.miet.forest.service;

import main.java.org.miet.forest.model.animals.Pig;
import main.java.org.miet.forest.model.animals.Wolf;
import main.java.org.miet.forest.model.base.ForestInhabitant;
import main.java.org.miet.forest.model.plants.Corn;
import main.java.org.miet.forest.model.types.AnimalSize;

import java.util.Random;

public class ForestService {
    private static final Random rand = new Random();

    public static ForestInhabitant getRandomInhabitant() {
        switch (rand.nextInt() % 2) {
            case 0:
                AnimalSize animalSize = Utils.getRandomValue(AnimalSize.values());
                switch (rand.nextInt() % 2) {
                    case 0:
                        return new Wolf(animalSize);
                    case 1:
                        return new Pig(animalSize);

                }
            case 1:
                return new Corn();
            default:
                return new Corn();
        }

    }
}
