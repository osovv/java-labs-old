package main.java.org.miet.forest.model.animals;

import main.java.org.miet.forest.model.types.AnimalSize;
import main.java.org.miet.forest.model.types.AnimalType;
import main.java.org.miet.forest.model.base.ForestInhabitant;
import main.java.org.miet.forest.model.base.Animal;
import main.java.org.miet.forest.model.base.Plant;

public class Wolf extends Animal {
    public Wolf(AnimalSize size) {
        super(AnimalType.CARNIVORE, size);
    }

    @Override
    public boolean canEat(ForestInhabitant inhabitant) {
        if (inhabitant instanceof Animal) {
            Animal animal = (Animal) inhabitant;
            return super.canEat(inhabitant)
                    && this.biggerThan(animal);
        } else if (inhabitant instanceof Plant) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.formString("Wolf");
    }
}

