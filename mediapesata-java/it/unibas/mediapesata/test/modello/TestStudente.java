package it.unibas.mediapesata.test.modello;

import junit.framework.*;

import it.unibas.mediapesata.modello.Studente;
import it.unibas.mediapesata.modello.Esame;

public class TestStudente extends TestCase {

    private Studente studente;
    private Esame esame1;
    private Esame esame2;
    private Esame esame3;

    public void setUp() {
        //System.out.println("Sto eseguendo setUp()");
        studente = new Studente("Mario", "Rossi", 1234);
        esame1 = new Esame("Analisi", 24, false, 3);
        esame2 = new Esame("Geometria", 27, false, 9);
        esame3 = new Esame("Fisica", 30, true, 9);
    }

    public void testNoEsami() {
        try {
            studente.getMediaPesata();
            Assert.fail();
        } catch (Exception e) { }
    }

    public void testMediaPesata1() {
        //System.out.println("Sto eseguendo testMediaPesata1()");
        studente.addEsame(esame1);
        studente.addEsame(esame2);
        assertEquals(26.25, studente.getMediaPesata());
    }

    public void testMediaPesata2() {
        //System.out.println("Sto eseguendo testMediaPesata2()");
        studente.addEsame(esame1);
        assertEquals(24.0, studente.getMediaPesata());
    }

    public void testMediaPesata3() {
        //System.out.println("Sto eseguendo testMediaPesata3()");
        studente.addEsame(esame1);
        studente.addEsame(esame3);
        assertEquals(28.5, studente.getMediaPesata());
    }

    public void testMediaPesata4() {
        //System.out.println("Sto eseguendo testMediaPesata4()");
        studente.addEsame(esame1);
        studente.addEsame(esame2);
        studente.addEsame(esame3);
        assertEquals(27.85, studente.getMediaPesata(), 1E-2);
    }

}
