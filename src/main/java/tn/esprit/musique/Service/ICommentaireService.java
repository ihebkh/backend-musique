package tn.esprit.musique.Service;

import tn.esprit.musique.Entity.Commentaire;


import java.util.List;

public interface ICommentaireService {
    List<Commentaire> retrieveAllCommentaire();
    Commentaire addUCommentaire(Commentaire commentaire);
    void removeCommentaire(Long idcommentaire);
    Commentaire modifyCommentaire(Commentaire commentaire);
     Commentaire retrieveCommentaire(Long CommentaireId);
}
