package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto.JoueursDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces.JoueurServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.objet.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class JoueurServicesImpl implements JoueurServices {

    private List<JoueursDTO> joueurs;

    public JoueurServicesImpl() {
        joueurs = new ArrayList<>();
    }

    @Override
    public JoueursDTO ajouterJoueur(String pseudo, int langue, String interets, String prenom , int annee_naissance) throws AjoutJoueurException {
        //initialisation variable
        Langue lang;

        //vérifier langue
        try {
            lang = Langue.getLangueByChoix(langue);
        }
        catch (LangueInvalideException e) {
            throw new LangueInvalideException();
        }

        //vérifier pseudo
        for (JoueursDTO joueur : joueurs) if (joueur.getPseudo().equals(pseudo)) throw new PseudoExistantException();
        if (Pattern.matches("^\\d.*", pseudo)) throw new PseudoInvalideException();

        //vérifier interets
        if (Pattern.matches(".*,$", interets)) throw new CentreDInteretInvalideException();

        //ajout joueur à la liste
        JoueursDTO joueur = new JoueursDTO(pseudo, lang, interets, prenom, annee_naissance);
        joueurs.add(joueur);
        return joueur;
    }
}
