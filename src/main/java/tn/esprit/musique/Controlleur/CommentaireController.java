package tn.esprit.musique.Controlleur;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.musique.Entity.Commentaire;
import tn.esprit.musique.Entity.Evenement;
import tn.esprit.musique.Repository.EvenementRepository;
import tn.esprit.musique.Service.ICommentaireService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Commentaire")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentaireController {
    private final ICommentaireService commentaireService;
    private final EvenementRepository evenementRepository;

    @GetMapping("/retrieve-all-Commentaire")
    public List<Commentaire> getCommentaire() {
        return commentaireService.retrieveAllCommentaire();
    }

    @PostMapping("/add-commentaire")
    public Commentaire addcommentaire(@RequestBody Commentaire commentaire) {
            return commentaireService.addUCommentaire(commentaire);
    }

    @DeleteMapping("/remove-commentaire/{commentaire-id}")
    public void removecommentaire(@PathVariable("commentaire-id") Long id) {
        commentaireService.removeCommentaire(id);
    }

    @GetMapping("/retrieve-Commentaire/{Commentaire-id}")
    public Commentaire retrieveCommentaire(@PathVariable("Commentaire-id") Long CommentaireId) {
        return commentaireService.retrieveCommentaire(CommentaireId);
    }

}
