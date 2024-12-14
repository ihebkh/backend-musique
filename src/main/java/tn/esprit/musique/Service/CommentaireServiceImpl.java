package tn.esprit.musique.Service;

import org.springframework.stereotype.Service;
import tn.esprit.musique.Entity.Commentaire;
import tn.esprit.musique.Entity.Evenement;
import tn.esprit.musique.Repository.CommentaireReposiroy;

import java.util.List;

@Service
public class CommentaireServiceImpl implements ICommentaireService {

    private final CommentaireReposiroy commentaireRepository;

    public CommentaireServiceImpl(CommentaireReposiroy commentaireRepository) {
        this.commentaireRepository = commentaireRepository;
    }

    @Override
    public List<Commentaire> retrieveAllCommentaire() {
        return commentaireRepository.findAll();
    }

    @Override
    public Commentaire addUCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public void removeCommentaire(Long idcommentaire) {
        commentaireRepository.deleteById(idcommentaire);
    }

    @Override
    public Commentaire modifyCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }
    @Override
    public Commentaire retrieveCommentaire(Long CommentaireId) {
        return commentaireRepository.findById(CommentaireId).get();
    }
}
