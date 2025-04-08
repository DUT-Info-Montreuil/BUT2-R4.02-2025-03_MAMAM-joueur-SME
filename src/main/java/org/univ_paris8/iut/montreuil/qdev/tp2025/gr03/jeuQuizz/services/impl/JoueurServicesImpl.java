package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces.JoueurServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class JoueurServicesImpl implements JoueurServices {

    private List<JoueurDTO> joueurs;

    public JoueurServicesImpl() {
        joueurs = new ArrayList<>();
    }

    @Override
    public JoueurDTO ajouterJoueur(String pseudo, Langue langue, String interets, String prenom , int annee_naissance) throws AjoutJoueurException {
        //vérifier pseudo
        for (JoueurDTO joueur : joueurs) if (joueur.getPseudo().equals(pseudo)) throw new PseudoExistantException();
        if (Pattern.matches("^\\d.*", pseudo)) throw new PseudoInvalideException();

        //vérifier interets
        if (Pattern.matches(".*,$", interets)) throw new InteretsInvalidesException();

        //ajout joueur à la liste
        JoueurDTO joueur = new JoueurDTO(pseudo, langue, interets, prenom, annee_naissance);
        joueurs.add(joueur);
        return joueur;
    }

    public List<JoueurDTO> getJoueurs() {
        return joueurs;
    }

    public void deleteAll() {
        joueurs.clear();
    }

    public void deleteJoueur(JoueurDTO joueur) {
        joueurs.remove(joueur);
    }
}
