package main.java.org.miet.forest.view;

import main.java.org.miet.forest.model.Forest;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    private static Map<Integer, CLICommand> commands = Map.ofEntries(
            new AbstractMap.SimpleEntry<Integer, CLICommand>(1, CLICommand.PRINT_FOREST),
            new AbstractMap.SimpleEntry<Integer, CLICommand>(0, CLICommand.EXIT)
    );

    public CLICommand getNextCommand() {
        this.printGreeting();
        System.out.print(">>> ");
        String commandString = scanner.next();
        CLICommand command;
        try {
            Integer commandCode = Integer.parseInt(commandString);
            command = commands.get(commandCode);
        } catch (NullPointerException e) {
            command = null;
        } catch (ClassCastException e) {
            command = null;
        } catch (NumberFormatException e) {
            command = null;
        }

        if (command != null) {
            return command;
        } else {
            System.out.println("Нет такой команды!");
            return CLICommand.SKIP;
        }
    }

    public void printGreeting() {
        System.out.println("=============Меню=============");
        System.out.println("Распечатать содержимое леса..1");
        System.out.println("Выход........................0");
    }

    public void printGoodbye() {
        System.out.println("До свидания!");
    }

    public void printForest(Forest forest) {
        System.out.println(forest.toString());
    }
}
