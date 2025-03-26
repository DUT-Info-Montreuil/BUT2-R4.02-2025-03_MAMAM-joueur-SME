package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.impl.JoueurServicesImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces.JoueurServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.CentreDInteretInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.LangueInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.PseudoExistantException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.Langue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
private static JoueurServices joueurServices;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @BeforeAll
    static void setUp() {
        joueurServices=new JoueurServicesImpl();
    }
    @Test
    public void ajouterJoueurTestok()  {
        JoueurServices joueurServices=new AjouterJoueurOkBouchon();
        assertThrows(PseudoExistantException.class,() ->{
         joueurServices.ajouterJoueur("j1", Langue.FRANÇAIS,"sport,cuisine","Manele",2005);
        });

    }
 @Test
public void pseudoJoueurExistantTestok(){
        JoueurServices joueurServices1=new PseudoJoueurExistantOkBouchon();
        assertThrows(PseudoExistantException.class,() ->{
        joueurServices1.ajouterJoueur("j1", Langue.FRANÇAIS,"sport,cuisine","Manele",2005);
        joueurServices1.ajouterJoueur("j1", Langue.FRANÇAIS,"jeux","yamal",2002);
        });
 }
@Test
    public void langueInvalideTestok(){
           JoueurServices joueurService2=new LangueInvalideKoBouchon();
    assertThrows(LangueInvalideException.class, () -> {
        joueurService2.ajouterJoueur("j2", Langue.ITALIEN, "sport", "Himad", 2006);
    });
}

@Test
    public void centreDinteretInvalideTestok(){
        JoueurServices joueurServices3=new CentreDinteretInvalideOkBouchon();
    assertThrows(CentreDInteretInvalideException.class, () -> {
            joueurServices3.ajouterJoueur("j1", Langue.ANGLAIS," sport,cuisine,","Alicia",1999);

        });
}

}


























