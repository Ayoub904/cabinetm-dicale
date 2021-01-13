/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.InterventionMedicale;
import bean.TypeIntervention;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class InterventionService {

    public int creerIntervention(String id, String idTypeIntervention, String idPatient, String idMaladie, String date, ArrayList<InterventionMedicale> interventions) {

        if (findInterventionById(id, interventions) != null) {
            return -1;
        } else {
            InterventionMedicale intervention = new InterventionMedicale(id, idTypeIntervention, idPatient, idMaladie, date);
            interventions.add(intervention);

            return 1;
        }

    }

    public InterventionMedicale findInterventionById(String id, ArrayList<InterventionMedicale> interventions) {

        for (int i = 0; i < interventions.size(); i++) {
            InterventionMedicale resultat = interventions.get(i);

            if (resultat.getId().equals(id)) {
                return resultat;
            }

        }
        return null;

    }

    public InterventionMedicale facture(String id, ArrayList<InterventionMedicale> interventions) {

        InterventionMedicale resultat = findInterventionById(id, interventions);

        if (resultat.getIdTypeIntervention().equals("XX1")) {
            resultat.setMontant(100);
        } else if (resultat.getIdTypeIntervention().equals("XX2")) {
            resultat.setMontant(200);
        } else if (resultat.getIdTypeIntervention().equals("XX3")) {
            resultat.setMontant(5000);
        }

        return resultat;
    }

    public ArrayList<InterventionMedicale> findByIdMaladie(String idMaladie, ArrayList<InterventionMedicale> interventions) {

        ArrayList<InterventionMedicale> resultats = new ArrayList();

        for (int i = 0; i < interventions.size(); i++) {
            InterventionMedicale intervention = interventions.get(i);

            if (intervention.getIdMaladie().equals(idMaladie)) {
                resultats.add(intervention);
            }

        }

        return resultats;

    }
}
