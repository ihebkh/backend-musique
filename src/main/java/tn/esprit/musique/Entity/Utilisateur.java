package tn.esprit.musique.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Utilisateur {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    long idutilisateur ;
    String nom_utilisateur;
    @Column(unique = true, nullable = false)
    String email;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
    @JsonIgnore
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    List<Evenement> evenements ;

}
