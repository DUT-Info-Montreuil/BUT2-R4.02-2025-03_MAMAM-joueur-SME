package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.impl.JoueurServicesImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces.JoueurServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.InteretsInvalidesException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.Langue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
private static JoueurServicesImpl joueurServices;
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

    @BeforeEach
    public void beforeEach(){
        joueurServices.deleteAll();
    }
    @Test
    public void ajouterJoueurTestok() throws AjoutJoueurException {
      // joueurServices=new AjouterJoueurOkBouchon();
        JoueurDTO joueur = new JoueurDTO("toto",Langue.FRANÇAIS,"basket","Manele",2005);
        assertTrue(joueur.equals(joueurServices.ajouterJoueur("toto",Langue.FRANÇAIS,"basket","Manele",2005)));
    }
 @Test
public void pseudoJoueurExistantTestok(){
   // joueurServices=new PseudoJoueurExistantOkBouchon();
        assertThrows(PseudoExistantException.class,() ->{
        joueurServices.ajouterJoueur("j1", Langue.FRANÇAIS,"sport,cuisine","Manele",2005);
        joueurServices.ajouterJoueur("j1", Langue.FRANÇAIS,"jeux","yamal",2002);
        });
 }
//@Test
//    public void langueInvalideTestko() throws AjoutJoueurException {
//    joueurServices=new LangueInvalideKoBouchon();
//    JoueurDTO joueur = new JoueurDTO("j2", Langue.ITALIEN, "sport", "Himad", 2006);
//        assertTrue(joueur.equals(joueurServices.ajouterJoueur("j2", Langue.ITALIEN, "sport", "Himad", 2006)));
//}

@Test
    public void centreDinteretInvalideTestok(){
   // joueurServices=new CentreDinteretInvalideOkBouchon();
    assertThrows(InteretsInvalidesException.class, () -> {
            joueurServices.ajouterJoueur("j1", Langue.ANGLAIS," sport,cuisine,","Alicia",1999);

        });
}

}


























