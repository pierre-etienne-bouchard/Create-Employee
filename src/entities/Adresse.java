/*
 * Classe adresse. 
 * Historique:
 * 180706 - Creation
 */
package entities;

/**
 *
 * @author Pierre-Etienne Bouchard (1895248@bdeb.qc.ca)
 */
public class Adresse {
    private int numero;
    private String nom;
    private String codePostal;
    private int appartment;

    public Adresse(int numero, String nom, String codePostal, int appartment) {
        this.numero = numero;
        this.nom = nom;
        this.codePostal = codePostal;
        this.appartment = appartment;
    }

    public void afficher(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Nom: " + this.nom);
        System.out.println("Code Postal: " + this.codePostal);
        System.out.println("Appartment: " + this.appartment);
    }
}
