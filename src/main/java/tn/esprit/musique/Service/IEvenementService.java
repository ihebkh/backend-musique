package tn.esprit.musique.Service;


import tn.esprit.musique.Entity.Evenement;

import java.util.List;
import java.util.Optional;

public interface IEvenementService {
    List<Evenement> retrieveAllEvenement();

    Evenement addUEvenement(Evenement evenement);

    void removeEvenement(Long idEvenement);

    Evenement modifyEvenement(Evenement evenement);

    Evenement retrieveEvenement(Long EvenementId);
    Evenement affecterUtilisateurAEvenement(Long idEvenement, Long idUtilisateur);
}
