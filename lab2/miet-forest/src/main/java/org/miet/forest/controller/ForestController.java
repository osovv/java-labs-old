package main.java.org.miet.forest.controller;


import main.java.org.miet.forest.model.Forest;
import main.java.org.miet.forest.view.CLI;
import main.java.org.miet.forest.view.CLICommand;

import java.util.Properties;

public class ForestController {
    private static Forest model;
    private static CLI view;

    public ForestController(Forest model, CLI view, Properties props) {
        this.model = model;
        this.view = view;
    }

    public boolean switchMenu() {
        CLICommand command = view.getNextCommand();
        switch(command) {
            case PRINT_FOREST:
                view.printForest(this.model);
                return true;
            case SKIP:
                return true;
            case EXIT:
                view.printGoodbye();
                return false;
        }
        return false;
    }
}
