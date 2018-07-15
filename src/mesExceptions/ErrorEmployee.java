/*
 * 180706 - Classe d'erreur pour la saisie du panneau des information de
 * l'employe.
 */
package mesExceptions;

/**
 *
 * @author Pierre-Etienne Bouchard (1895248@bdeb.qc.ca)
 */
public class ErrorEmployee  extends Exception{
    public ErrorEmployee(){
        System.err.println("Warning: The employee's informations are incorrect");
    }
}
