package main.java.org.miet.forest.model.base;

public abstract class ForestInhabitant {
    public boolean canEat(ForestInhabitant inhabitant) {
        return inhabitant != this;
    }
}
