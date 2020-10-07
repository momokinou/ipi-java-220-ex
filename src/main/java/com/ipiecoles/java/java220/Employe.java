package com.ipiecoles.java.java220;
import org.joda.time.LocalDate;
import java.util.Objects;

public class Employe {
    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double Salaire = Entreprise.SALAIRE_BASE;
    public Employe();
}