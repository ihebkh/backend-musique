package tn.esprit.musique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.musique.Entity.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
}
