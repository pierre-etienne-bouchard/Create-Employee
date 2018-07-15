/*
 * 180706 - Classe d'erreur pour la saisie du panneau du departement de
 * l'employe.
 */
package mesExceptions;

/**
 *
 * @author Pierre-Etienne Bouchard (1895248@bdeb.qc.ca)
 */
public class ErrorDepartment  extends Exception{
    public ErrorDepartment(){
        System.err.println("Warning: The employee's department is incorrect");
    }
}
