package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.*;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.Langue;

public interface JoueurServices {
    JoueurDTO ajouterJoueur(String pseudo, Langue langue, String interets, String prenom , int annee_naissance) throws AjoutJoueurException;
}