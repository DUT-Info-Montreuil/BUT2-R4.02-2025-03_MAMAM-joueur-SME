package org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.objet;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr03.jeuQuizz.utils.exceptions.LangueInvalideException;

public enum Langue {
    FRANÇAIS(1),ANGLAIS(2),ALLMANDS(3),ESPAGNOL(4),ITALIEN(5);

    private Langue(final int choix){
        this.choix=choix;
    }
    private int choix;

    public static Langue getLangueByChoix(int choix) throws LangueInvalideException {
        for (Langue langue : Langue.values()) if (langue.choix == choix) return langue;
        throw new LangueInvalideException();
    }
}
