package fr.uvsq.pglp;
import java.util.EmptyStackException;
import java.util.Scanner;

public class SaisirRpn {

    private Scanner rep=new Scanner(System.in);
    private MoteurRpn Moteur=new MoteurRpn();
    private String saisie=new String();

    /**
     * Fonction d'interaction avec l'utilisateur et qui invoque le Moteur RPN
     * @throws ClasseException : Exception qui g�re la division par zero
     * @throws PilevideException : Exception qui g�re la pilevide
     * @throws ManqueOperandeException : Exception qui g�re le manque
     * d'oprande pour effectuer un calcul
     *
     */
    public void reception()
    {
        Moteur.initMoteurRpn();
        System.out.println("L'expression courante est: ");
        do{
            this.saisie=rep.nextLine();
            if(verifisaisie(this.saisie)==false){
                try {
                    Moteur.apply(this.saisie);
                } catch (IllegalStateException e) {
                    // TODO: handle exception
                }catch(EmptyStackException e) {

                }

            }else{

                Moteur.enregistrer(Double.parseDouble(saisie));
            }

            Moteur.affiche();

        }while(true);

    }

    /**
     * Fonction qui permet de verifier si utilisateur a saisie une operande ou un operateur
     * et renvoi un booleen
     * @param val : valeur saisie par utilisateur
     * @return Renvoi Vrai si c'est une operande et Faux si non
     */
    private boolean verifisaisie(String val){
        try{
            double test=Double.parseDouble(val);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;

    }

}
