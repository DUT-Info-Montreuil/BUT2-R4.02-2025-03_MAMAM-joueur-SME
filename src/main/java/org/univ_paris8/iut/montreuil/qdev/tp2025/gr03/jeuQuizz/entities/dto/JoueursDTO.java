package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.objet.Langue;

public class JoueursDTO {
    private String pseudo;
    private Langue langue;
    private  String prenom;
    private int annee_naissance;
    private String interets;



    public JoueursDTO(String pseudo, Langue langue, String interets, String prenom , int annee_naissance){
        this.pseudo=pseudo;
        this.langue=langue;
        this.interets=interets;
        this.prenom=prenom;
        this.annee_naissance=annee_naissance;
    }
}
