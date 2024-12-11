package tn.esprit.musique.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Commentaire {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    long idCommentaire ;
    String contenu;
    Date date_commentaire ;
    @ManyToOne
    @JoinColumn(name = "idevenement", nullable = false)
    Evenement evenement;
}
