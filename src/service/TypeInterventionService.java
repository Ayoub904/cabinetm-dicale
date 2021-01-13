/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.InterventionMedicale;
import bean.TypeIntervention;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class TypeInterventionService {
    
    public int ceerTypeIntervention(String id, String libelle, ArrayList<TypeIntervention> typesIntervention) {
        
        if (findTypeInterventionById(id, typesIntervention) != null) {
            return -1;
        } else {
            TypeIntervention type = new TypeIntervention(id, libelle);
            typesIntervention.add(type);
            
            return 1;
        }
        
    }
    
    public TypeIntervention findTypeInterventionById(String id, ArrayList<TypeIntervention> typesIntervention) {
        
        for (int i = 0; i < typesIntervention.size(); i++) {
            TypeIntervention resultat = typesIntervention.get(i);
            
            if (resultat.getId().equals(id)) {
                return resultat;
            }
            
        }
        return null;
        
    }
    
}
