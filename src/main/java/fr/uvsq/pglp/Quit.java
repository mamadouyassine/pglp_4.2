package fr.uvsq.pglp;

public class Quit  implements GenericCommand {

    private final Generic quit;

    public Quit(Generic quit) {
        this.quit=quit;

    }

    @Override//command
    public void apply() {
        // TODO Auto-generated method stub
        quit.quit();

    }
}
