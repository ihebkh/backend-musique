package tn.esprit.musique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.musique.Entity.Utilisateur;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByEmail(String email);
}
