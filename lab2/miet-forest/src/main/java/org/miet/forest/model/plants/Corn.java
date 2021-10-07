package main.java.org.miet.forest.model.plants;

import main.java.org.miet.forest.model.base.ForestInhabitant;
import main.java.org.miet.forest.model.types.PlantType;
import main.java.org.miet.forest.model.base.Plant;

public class Corn extends Plant {
    public Corn() {
        super(PlantType.GRASS);
    }

    @Override
    public boolean canEat(ForestInhabitant inhabitant) {
        return false;
    }

    @Override
    public String toString() {
        return super.formString("Corn");
    }
}
