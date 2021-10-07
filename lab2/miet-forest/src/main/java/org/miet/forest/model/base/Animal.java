package main.java.org.miet.forest.model.base;

import main.java.org.miet.forest.model.types.AnimalSize;
import main.java.org.miet.forest.model.types.AnimalType;

import java.util.LinkedList;
import java.util.List;

public abstract class Animal extends ForestInhabitant {
    private AnimalSize size;
    private final AnimalType type;

    public Animal(AnimalType type, AnimalSize size) {
        this.type = type;
        this.size = size;
    }
    public AnimalSize getSize() {
        return size;
    }

    public AnimalType getType() {
        return type;
    }

    public void setSize(AnimalSize size) {
        this.size = size;
    }

    public List<ForestInhabitant> findFood(List<ForestInhabitant> forestInhabitants) {
        List<ForestInhabitant> eatableForestInhabitants = new LinkedList<ForestInhabitant>();
        for (ForestInhabitant forestInhabitant : forestInhabitants) {
            if (this.canEat(forestInhabitant))
                eatableForestInhabitants.add(forestInhabitant);
        }
        return eatableForestInhabitants;
    }

    public Boolean biggerThan(Animal another) {
        return this.getSize().ordinal() > another.getSize().ordinal();
    }

    public String formString() {
        StringBuilder res = new StringBuilder("Animal:\n");
        res.append("\tsize: ").append(this.size).append("\n");
        res.append("\ttype: ").append(this.type).append("\n");
        return res.toString();
    }

    public String formString(String name) {
        StringBuilder res = new StringBuilder();
        res.append(name).append(":\n");
        res.append("\tsize: ").append(this.size).append("\n");
        res.append("\ttype: ").append(this.type).append("\n");
        return res.toString();
    }

    @Override
    public String toString() {
        return this.formString();
    }
}













