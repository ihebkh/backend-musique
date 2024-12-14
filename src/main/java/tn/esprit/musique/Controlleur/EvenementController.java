package tn.esprit.musique.Controlleur;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.musique.Entity.Evenement;
import tn.esprit.musique.Repository.EvenementRepository;
import tn.esprit.musique.Service.IEvenementService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/Evenements")
@CrossOrigin(origins = "http://localhost:4200")
public class EvenementController {

    private final IEvenementService evenementService;
    private final EvenementRepository evenementRepository;

    @GetMapping("/retrieve-all-events")
    public List<Evenement> getEvenements() {
        return evenementService.retrieveAllEvenement();
    }

    @PostMapping("/add-Evenement")
    public Evenement addEvenement(@RequestBody Evenement evenement) {
        return evenementService.addUEvenement(evenement);
    }

    @DeleteMapping("/remove-Evenement/{Evenement-id}")
    public void removeEvenement(@PathVariable("Evenement-id") Long id) {
        evenementService.removeEvenement(id);
    }

    @PutMapping("/modify-Evenement")
    public Evenement modifyEvenement(@RequestBody Evenement evenement) {
        return evenementService.modifyEvenement(evenement);
    }
    @GetMapping("/retrieve-Evenement/{Evenement-id}")
    public Evenement retrieveChambre(@PathVariable("Evenement-id") Long EvenementId) {
        Evenement ev = evenementService.retrieveEvenement(EvenementId);
        return ev;
    }

    @PutMapping("/affecter/{Evenement-id}")
    public void  affecteruserevenement(@PathVariable("Evenement-id") Long EvenementId,@RequestBody Long IdUtilisateur) {
      evenementService.affecterevementutilisateur(EvenementId, IdUtilisateur);


    }




}
