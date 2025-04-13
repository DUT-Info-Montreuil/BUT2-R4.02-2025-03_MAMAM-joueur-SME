package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces.JoueurServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.AjoutJoueurException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.InteretsInvalidesException;

public class CentreDinteretInvalideOkBouchon implements JoueurServices {

    @Override
    public JoueurDTO ajouterJoueur(String pseudo, Langue langue, String interets, String prenom, int annee_naissance) throws AjoutJoueurException {
        throw  new InteretsInvalidesException();
    }
}
