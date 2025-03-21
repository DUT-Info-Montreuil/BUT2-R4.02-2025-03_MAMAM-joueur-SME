package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto.JoueursDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.services.interfaces.JoueurServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.AjoutJoueurException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.LangueInvalideException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.objet.Langue;

import java.util.Arrays;

public class LangueInvalideKoBouchon implements JoueurServices {

    @Override
    public JoueursDTO ajouterJoueur(String pseudo, Langue langue, String interets, String prenom, int annee_naissance) throws AjoutJoueurException {
        return new JoueursDTO("j1", Langue.FRANÇAIS, "sport,cuisine", "Manele", 2005);

    }}
