package fr.uvsq.pglp;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import java.util.Stack;

import org.junit.Test;

public class UndoTest {
    @Test
    public void test() {
        Generic genericProg = new Generic();
        MoteurRpn moteur = new MoteurRpn();
        GenericCommand undoprog = new Undo (genericProg,moteur);
        Interpreteur commanGenrric = new Interpreteur();
        commanGenrric.register("undo", undoprog);
        commanGenrric.execute("undo");
    }

}