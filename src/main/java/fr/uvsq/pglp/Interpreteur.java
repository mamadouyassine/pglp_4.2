package fr.uvsq.pglp;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class Interpreteur {
    private final HashMap<String, Commands> commandMap = new HashMap<>();

    public void register(String commandName, Commands command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        Commands command = commandMap.get(commandName);
        try {
            if (command == null) {
                System.out.println("erreur de commande ...");
                throw new IllegalStateException("no command registered for " + commandName);
            }
            command.apply();

        } catch (IllegalStateException e) {

        }catch(EmptyStackException e) {

        }
    }

}
