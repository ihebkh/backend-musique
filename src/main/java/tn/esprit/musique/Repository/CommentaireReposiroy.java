package tn.esprit.musique.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.musique.Entity.Commentaire;

public interface CommentaireReposiroy extends JpaRepository<Commentaire, Long> {
}
