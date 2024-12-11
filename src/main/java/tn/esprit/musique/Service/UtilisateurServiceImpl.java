package tn.esprit.musique.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.musique.Entity.Utilisateur;
import tn.esprit.musique.Repository.UtilisateurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements IUtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public Utilisateur addUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    public void removeUtilisateur(Long utilisateurID) {
        utilisateurRepository.deleteById(utilisateurID);
    }

    public Utilisateur modifyUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    public List<Utilisateur> retrieveAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    public String login(String email, String password) {
        Utilisateur utilisateur = utilisateurRepository.findByEmail(email);
        if (utilisateur != null && utilisateur.getPassword().equals(password)) {
            return utilisateur.getRole().toString();
        }
        throw new RuntimeException("Email ou mot de passe incorrect");
    }
}
