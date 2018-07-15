/*
 * 180706 - Classe d'erreur pour la saisie du panneau de l'adresse de
 * l'employe.
 */
package mesExceptions;

/**
 *
 * @author Pierre-Etienne Bouchard (1895248@bdeb.qc.ca)
 */
public class ErrorAdresse  extends Exception{
    public ErrorAdresse(){
        System.err.println("Warning: The employee's adresse is incorrect");
    }
}
