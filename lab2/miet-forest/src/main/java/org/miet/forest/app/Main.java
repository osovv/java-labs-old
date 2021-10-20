package main.java.org.miet.forest.app;

import main.java.org.miet.forest.controller.ForestController;
import main.java.org.miet.forest.model.*;
import main.java.org.miet.forest.model.animals.Pig;
import main.java.org.miet.forest.model.animals.Wolf;
import main.java.org.miet.forest.model.base.Animal;
import main.java.org.miet.forest.model.base.Plant;
import main.java.org.miet.forest.model.plants.Corn;
import main.java.org.miet.forest.model.types.AnimalSize;
import main.java.org.miet.forest.service.Preloader;
import main.java.org.miet.forest.view.CLI;

import java.util.Properties;

public class Main {
    public static Forest model;
    public static ForestController controller;
    public static CLI view;
    public static Properties prop;

    public static void main(String[] args) {
        try {
            prop = new Properties();
            Preloader PRL = new Preloader("src/main/java/org/miet/forest/config.ini", prop);
            model = new Forest(10);
            view = new CLI();
            controller = new ForestController(model, view, prop);
            boolean run = true;

            while(run) {
                run = controller.switchMenu();
            }
        } catch (Exception e) {
            System.err.println("Ошибка - "+e.getMessage());
        }



//        Animal wolf = new Wolf(AnimalSize.LARGE);
//        Animal pig = new Pig(AnimalSize.SMALL);
//        Plant corn = new Corn();
//
//        System.out.println(String.format("Wolf can eat pig: %s", wolf.canEat(pig)));
//        System.out.println(String.format("Wolf can eat corn: %s", wolf.canEat(corn)));
//        System.out.println(String.format("Pig can eat wolf: %s", pig.canEat(wolf)));
//        System.out.println(String.format("Pig can eat corn: %s", pig.canEat(corn)));
//        System.out.println(String.format("Corn can eat wolf: %s", corn.canEat(wolf)));
//        System.out.println(String.format("Wolf can eat self: %s", wolf.canEat(wolf)));
//
//        Forest forest = new Forest(10);
//        System.out.println(forest);
//        wolf.findFood(forest.getInhabitants());
    }
}
