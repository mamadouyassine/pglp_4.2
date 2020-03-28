package fr.uvsq.pglp;

import static org.junit.Assert.*;
import org.junit.Test;

public class QuitTest {
    @Test
    public void test() {

        Generic genericProg=new Generic();

        GenericCommand quitprog = new Quit(genericProg);

        Interpreteur interprete = new Interpreteur();
        interprete.register("quit", quitprog);

        interprete.execute("quit");


    }

}