package fr.uvsq.pglp;

public class Undo implements GenericCommand {
    private final Generic undo;
    private final MoteurRpn moteur;
    public Undo(Generic undo,MoteurRpn moteur) {
        this.undo=undo;
        this.moteur=moteur;

    }

    @Override//command
    public void apply() {
        // TODO Auto-generated method stub
        undo.undo(this.moteur);


    }


}
