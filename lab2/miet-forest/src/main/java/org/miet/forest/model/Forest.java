package main.java.org.miet.forest.model;

import main.java.org.miet.forest.model.base.ForestInhabitant;
import main.java.org.miet.forest.service.ForestService;

import java.util.LinkedList;
import java.util.List;

public class Forest {
    private final List<ForestInhabitant> inhabitants;

    public Forest(int size) {
        inhabitants = new LinkedList<ForestInhabitant>();
        for (int i = 0; i < size; i++) {
            inhabitants.add(ForestService.getRandomInhabitant());
        }
    }

    public List<ForestInhabitant> getInhabitants() {
        return inhabitants;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("=====Forest======\n");
        for (ForestInhabitant inhabitant : inhabitants) {
            res.append(inhabitant.toString()).append("\n");
        }
        res.append("================");
        return res.toString();
    }
}
