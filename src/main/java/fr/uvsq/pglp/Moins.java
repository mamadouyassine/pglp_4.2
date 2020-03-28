package fr.uvsq.pglp;
import java.util.EmptyStackException;

public class Moins implements SpecificCommands {
    private final Specific calcul;
    private final MoteurRpn moteur;

    public Moins(Specific calcul,MoteurRpn moteur) {
        this.calcul=calcul;
        this.moteur=moteur;
    }

    @Override
    public void apply() {

        double a=0,b = 0;
        int retour=0;
        try {
            a= moteur.depiler();
            retour++;
        } catch (EmptyStackException e) {
            // TODO: handle exception

        }

        try {
            b= moteur.depiler();
            moteur.enregistrer(this.operation(a, b));
        } catch (EmptyStackException e) {
            // TODO: handle exception
            if(retour==1)
                moteur.enregistrer(a);
        }

    }

    @Override
    public double operation(double a, double b) {
        // TODO Auto-generated method stub
        return calcul.moins(a, b);
    }
}
