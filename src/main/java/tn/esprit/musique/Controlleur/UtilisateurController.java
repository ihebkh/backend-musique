package tn.esprit.musique.Controlleur;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.musique.Entity.Utilisateur;
import tn.esprit.musique.Service.IUtilisateurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Utilisateur")
public class UtilisateurController  {

    IUtilisateurService utilisateurService;
    @GetMapping("/retrieve-all-users")
    public List<Utilisateur> getUsers() {
        List<Utilisateur> listUtilisateurs = utilisateurService.retrieveAllUtilisateur();
        return listUtilisateurs;
    }


    @PostMapping("/add-user")
    public Utilisateur User(@RequestBody Utilisateur c) {
        Utilisateur users = utilisateurService.addUtilisateur(c);
        return users;
    }

    @DeleteMapping("/remove-user/{user-id}")
    public void removeUser(@PathVariable("user-id") Long userID) {
        utilisateurService.removeUtilisateur(userID);
    }

    @PutMapping("/modify-user")
    public Utilisateur modifyUtilisateur(@RequestBody Utilisateur u) {
        Utilisateur utilisateur = utilisateurService.modifyUtilisateur(u);
        return utilisateur;
    }
    @PostMapping("/login")
    public String login(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.login(utilisateur.getEmail(), utilisateur.getPassword());
    }

}
