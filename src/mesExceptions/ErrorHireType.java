/*
 * 180706 - Classe d'erreur pour la saisie du type de Hire de
 * l'employe.
 */
package mesExceptions;

/**
 *
 * @author Pierre-Etienne Bouchard (1895248@bdeb.qc.ca)
 */
public class ErrorHireType  extends Exception{
    public ErrorHireType(){
        System.err.println("Warning: The employee's hire type is incorrect");
    }
}
