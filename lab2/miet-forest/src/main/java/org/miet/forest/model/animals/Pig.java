package main.java.org.miet.forest.model.animals;

import main.java.org.miet.forest.model.types.AnimalSize;
import main.java.org.miet.forest.model.types.AnimalType;
import main.java.org.miet.forest.model.base.ForestInhabitant;
import main.java.org.miet.forest.model.base.Animal;
import main.java.org.miet.forest.model.base.Plant;

public class Pig extends Animal {
    public Pig(AnimalSize size) {
        super(AnimalType.OMNIVORE, size);
    }

    @Override
    public boolean canEat(ForestInhabitant inhabitant) {
        if (inhabitant instanceof Animal) {
            Animal animal = (Animal) inhabitant;
            return super.canEat(inhabitant)
                    && animal.getSize() == AnimalSize.SMALL
                    && this.biggerThan(animal);
        } else if (inhabitant instanceof Plant) {
            Plant plant = (Plant) inhabitant;
            switch (plant.getType()) {
                case GRASS:
                case MUSHROOM:
                    return super.canEat(inhabitant);
                default:
                    return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.formString("Pig");
    }
}
