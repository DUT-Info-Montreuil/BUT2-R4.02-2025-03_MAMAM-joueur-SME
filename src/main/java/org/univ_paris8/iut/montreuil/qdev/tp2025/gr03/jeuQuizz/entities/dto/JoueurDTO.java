package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.entities.dto;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.Langue;

import java.util.Objects;

public class JoueurDTO {
    private String pseudo;
    private Langue langue;
    private  String prenom;
    private int annee_naissance;
    private String interets;
    public JoueurDTO(String pseudo, Langue langue, String interets, String prenom , int annee_naissance){
        this.pseudo=pseudo;
        this.langue=langue;
        this.interets=interets;
        this.prenom=prenom;
        this.annee_naissance=annee_naissance;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnnee_naissance() {
        return annee_naissance;
    }

    public void setAnnee_naissance(int annee_naissance) {
        this.annee_naissance = annee_naissance;
    }

    public String getInterets() {
        return interets;
    }

    public void setInterets(String interets) {
        this.interets = interets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoueurDTO joueurDTO = (JoueurDTO) o;
        return annee_naissance == joueurDTO.annee_naissance && Objects.equals(pseudo, joueurDTO.pseudo) && langue == joueurDTO.langue && Objects.equals(prenom, joueurDTO.prenom) && Objects.equals(interets, joueurDTO.interets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pseudo, langue, prenom, annee_naissance, interets);
    }
}
