package tn.esprit.musique.Service;


import tn.esprit.musique.Entity.Evenement;

import java.util.List;

public interface IEvenementService {
     List<Evenement> retrieveAllEvenement();
     Evenement addUEvenement(Evenement evenement);
     void removeEvenement(Long idEvenement);
     Evenement modifyEvenement(Evenement evenement);
}
