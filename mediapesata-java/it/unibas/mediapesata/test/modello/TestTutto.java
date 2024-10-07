package it.unibas.mediapesata.test.modello;

import junit.framework.*;

public class TestTutto extends TestCase {
        
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestEsame.class);
        suite.addTestSuite(TestStudente.class);
        return suite;
    }
    
}
