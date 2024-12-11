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
public class Evenement {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    long idevenement ;
    String nom_Evenement;
    Date date_evenemnets ;
    String lieu_evenements;
    @ManyToOne
    @JoinColumn(name = "idutilisateur", nullable = false)
    Utilisateur utilisateur;


}
