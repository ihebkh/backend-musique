package tn.esprit.musique.Service;

import org.springframework.stereotype.Service;
import tn.esprit.musique.Entity.Evenement;
import tn.esprit.musique.Entity.Utilisateur;
import tn.esprit.musique.Repository.EvenementRepository;
import tn.esprit.musique.Repository.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementServiceImpl implements IEvenementService {

    private final EvenementRepository evenementRepository;
    private final UtilisateurRepository utilisateurRepository;

    public EvenementServiceImpl(EvenementRepository evenementRepository, UtilisateurRepository utilisateurRepository) {
        this.evenementRepository = evenementRepository;
        this.utilisateurRepository = utilisateurRepository;
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

    public Evenement retrieveEvenement(Long EvenementId) {
        return evenementRepository.findById(EvenementId).get();
    }


    public Evenement affecterUtilisateurAEvenement(Long idEvenement, Long idUtilisateur) {
        Optional<Evenement> evenementOpt = evenementRepository.findById(idEvenement);
        Optional<Utilisateur> utilisateurOpt = utilisateurRepository.findById(idUtilisateur);

        if (evenementOpt.isPresent() && utilisateurOpt.isPresent()) {
            Evenement evenement = evenementOpt.get();
            Utilisateur utilisateur = utilisateurOpt.get();

            evenement.setUtilisateur(utilisateur);
            return evenementRepository.save(evenement);
        } else {
            throw new RuntimeException("Evenement ou Utilisateur non trouvé");
        }
    }
}
