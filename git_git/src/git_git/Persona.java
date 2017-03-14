/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_git;

/**
 *
 * @author Sobremesa
 */
public class Persona {
    private String nom;
    private int edat;
    private double altura;
        
         public Persona (String nom, int edat){
             this.nom=nom;
             this.edat=edat;
         }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
         
         
}
