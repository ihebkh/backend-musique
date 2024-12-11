package tn.esprit.musique.Controlleur;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.musique.Entity.Evenement;
import tn.esprit.musique.Service.IEvenementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Evenements")
public class EvenementController {

    private final IEvenementService evenementService;

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
}
