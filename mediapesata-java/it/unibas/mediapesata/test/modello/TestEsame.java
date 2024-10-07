package it.unibas.mediapesata.test.modello;

import junit.framework.*;
import it.unibas.mediapesata.modello.Esame;

public class TestEsame extends TestCase {

    public void testLode3() {
        try {
            Esame esame = new Esame("Analisi", 25, true, 3);
            Assert.fail();
        } catch (Exception e) { }
    }
}
