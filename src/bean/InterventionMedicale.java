/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Lenovo
 */
public class InterventionMedicale {
   private String id;
   private String idTypeIntervention;
   private String idPatient;
   private String idMaladie;
   private String date;
   private double montant;
   private String medicamentPrescrit;

    public InterventionMedicale() {
       
    }

    public InterventionMedicale(String id, String idTypeIntervention, String idPatient, String idMaladie, String date) {
        this.id = id;
        this.idTypeIntervention = idTypeIntervention;
        this.idPatient = idPatient;
        this.idMaladie = idMaladie;
        this.date = date;
    }
    

    public InterventionMedicale(String id, String idTypeIntervention, String idPatient, String idMaladie, String date, double montant, String medicamentPrescrit) {
        this.id = id;
        this.idTypeIntervention = idTypeIntervention;
        this.idPatient = idPatient;
        this.idMaladie = idMaladie;
        this.date = date;
        this.montant = montant;
        this.medicamentPrescrit = medicamentPrescrit;
    }

    public InterventionMedicale(String id, String idTypeIntervention, String idPatient, String idMaladie, String date, double montant) {
        this.id = id;
        this.idTypeIntervention = idTypeIntervention;
        this.idPatient = idPatient;
        this.idMaladie = idMaladie;
        this.date = date;
        this.montant = montant;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdTypeIntervention() {
        return idTypeIntervention;
    }

    public void setIdTypeIntervention(String idTypeIntervention) {
        this.idTypeIntervention = idTypeIntervention;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public String getIdMaladie() {
        return idMaladie;
    }

    public void setIdMaladie(String idMaladie) {
        this.idMaladie = idMaladie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMedicamentPrescrit() {
        return medicamentPrescrit;
    }

    public void setMedicamentPrescrit(String medicamentPrescrit) {
        this.medicamentPrescrit = medicamentPrescrit;
    }

    @Override
    public String toString() {
        return  "  InterventionMedical{" + "id=" + id + ", idTypeIntervention=" + idTypeIntervention + ", idPatient=" + idPatient + ", idMaladie=" + idMaladie + ", date=" + date + ", montant=" + montant + ", medicamentPrescrit=" + medicamentPrescrit + '}';
    }

    

  
}
