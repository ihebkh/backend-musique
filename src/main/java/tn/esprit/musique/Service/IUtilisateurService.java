package tn.esprit.musique.Service;
import tn.esprit.musique.Entity.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
         List<Utilisateur> retrieveAllUtilisateur();
         Utilisateur addUtilisateur(Utilisateur utilisateur);
         void removeUtilisateur(Long idutilisateur);
         Utilisateur modifyUtilisateur(Utilisateur utilisateur);
         String login(String email, String password);
     Utilisateur retrieveUtilisateur(Long id);

}
