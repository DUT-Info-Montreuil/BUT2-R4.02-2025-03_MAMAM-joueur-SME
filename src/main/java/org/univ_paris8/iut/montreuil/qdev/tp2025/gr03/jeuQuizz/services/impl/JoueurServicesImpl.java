package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces.JoueurServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.*;

import java.util.List;

public class JoueurServicesImpl implements JoueurServices {

    private List<JoueurDTO> joueurs;

    @Override
    public JoueurDTO ajouterJoueur(String pseudo, int langue, String interets, String prenom , int annee_naissance) throws AjoutJoueurException {
        return null;
    }
}
