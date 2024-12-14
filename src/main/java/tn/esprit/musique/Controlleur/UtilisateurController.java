package tn.esprit.musique.Controlleur;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.musique.Entity.Evenement;
import tn.esprit.musique.Entity.Utilisateur;
import tn.esprit.musique.Repository.UtilisateurRepository;
import tn.esprit.musique.Service.IUtilisateurService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/Utilisateur")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurController  {

    private final UtilisateurRepository utilisateurRepository;
    IUtilisateurService utilisateurService;
    @GetMapping("/retrieve-all-users")
    public List<Utilisateur> getUsers() {
        return  utilisateurService.retrieveAllUtilisateur();
    }


    @PostMapping("/add-user")
    public Utilisateur AddUser(@RequestBody Utilisateur c) {
       return utilisateurService.addUtilisateur(c);
    }

    @DeleteMapping("/remove-user/{user-id}")
    public void removeUser(@PathVariable("user-id") Long userID) {
        utilisateurService.removeUtilisateur(userID);
    }

    @PutMapping("/modify-user")
    public Utilisateur modifyUtilisateur(@RequestBody Utilisateur u) {
        return utilisateurService.modifyUtilisateur(u);

    }
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Utilisateur utilisateur) {
        String role = utilisateurService.login(utilisateur.getEmail(), utilisateur.getPassword());
        return ResponseEntity.ok(Map.of("role", role));
    }


    @GetMapping("/retrieve-Utilisateur/{Utilisateur-id}")
    public Utilisateur retrieveUtilisateurId(@PathVariable("Utilisateur-id") Long UtilisateurId) {
        return utilisateurService.retrieveUtilisateur(UtilisateurId);
    }




}
