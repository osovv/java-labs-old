package main.java.org.miet.forest.model.base;

import main.java.org.miet.forest.model.types.PlantType;

public abstract class Plant extends ForestInhabitant {
    protected PlantType type;

    public Plant(PlantType type) {
        this.type = type;
    }

    public PlantType getType() {
        return type;
    }

    @Override
    public boolean canEat(ForestInhabitant inhabitant) {
        return false;
    }
    public String formString() {
        StringBuilder res = new StringBuilder("Plant:\n");
        res.append("\ttype: ").append(this.type).append("\n");
        return res.toString();
    }

    public String formString(String name) {
        StringBuilder res = new StringBuilder();
        res.append(name).append(":\n");
        res.append("\ttype: ").append(this.type).append("\n");
        return res.toString();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Plant:\n");
        res.append("\ttype: ").append(this.type).append("\n");
        return res.toString();
    }
}
