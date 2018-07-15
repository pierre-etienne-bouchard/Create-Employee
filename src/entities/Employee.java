/*
 * Classe Employee. 
 * Historique:
 * 180706 - Creation
 */
package entities;

import java.util.Date;

/**
 *
 * @author Pierre-Etienne Bouchard (1895248@bdeb.qc.ca)
 */
public class Employee extends Personne{
    
    //On veut garder l'incrementation entre les appels
    private static Integer nombreId=0;
    
    private int id;
    private boolean fullTime;
    private Date hireDate;
    private double salary;
    private String department;
    private Adresse adresse;

    public Employee(
            String nom, String prenom,  
            boolean fullTime, 
            Date hireDate, 
            double salary, 
            String department,
            Adresse adresse) {
        super(nom,prenom);
        this.id = nombreId++;
        this.fullTime = fullTime;
        this.hireDate = hireDate;
        this.salary = salary;
        this.department = department;
        this.adresse = adresse;
    }

    
    public void afficher(){
        
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("ID: "+ id);
        System.out.println("Nom: "+ getNom());
        System.out.println("Prenom: "+ getPrenom());
        if(fullTime)
            System.out.println("Hire type: Full Time");
        else
            System.out.println("Hire type: Partial Time");
        System.out.println("Hire date: "+ hireDate);
        System.out.println("Salary: "+ salary);
        System.out.println("Department: "+ department);

        this.adresse.afficher();
        System.out.println("+++++++++++++++++++++++++++++++++\n\n");
    }
}
