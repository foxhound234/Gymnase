/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Rabelais
 */
public class Association {
    private String refAsso,ville,adresse,nomResp;

    public String getRefAsso() {
        return refAsso;
    }

    public void setRefAsso(String refAsso) {
        this.refAsso = refAsso;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNomResp() {
        return nomResp;
    }

    public void setNomResp(String nomResp) {
        this.nomResp = nomResp;
    }

    public Association(String refAsso, String ville, String adresse, String nomResp) {
        this.refAsso = refAsso;
        this.ville = ville;
        this.adresse = adresse;
        this.nomResp = nomResp;
    }
    
}
