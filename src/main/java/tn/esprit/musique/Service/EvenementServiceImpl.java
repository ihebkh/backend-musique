package tn.esprit.musique.Service;

import org.springframework.stereotype.Service;
import tn.esprit.musique.Entity.Evenement;
import tn.esprit.musique.Repository.EvenementRepository;
import tn.esprit.musique.Repository.UtilisateurRepository;

import java.util.List;

@Service
public class EvenementServiceImpl implements IEvenementService {

    private final EvenementRepository evenementRepository;
    public EvenementServiceImpl(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    public List<Evenement> retrieveAllEvenement() {
        return evenementRepository.findAll();
    }

    public Evenement addUEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    public void removeEvenement(Long idEvenement) {
        evenementRepository.deleteById(idEvenement);
    }

    public Evenement modifyEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

}
