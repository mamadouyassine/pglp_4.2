package fr.uvsq.pglp;

import java.util.EmptyStackException;
public class CalculatriceRPN {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SaisirRpn cal = new SaisirRpn();
        try {
            cal.reception();
        } catch (IllegalStateException e) {
            // TODO: handle exception
        }catch(EmptyStackException e) {

        }
    }
}
