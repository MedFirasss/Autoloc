
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repositories.PaimentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.repositories.PaimentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IPaiementServiceImp implements IPaimentService {

    private final PaimentRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> consulterPaiement() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement consulterPaiementById(Long idPaiement) {
        return paiementRepository.findById(idPaiement).orElse(null);
    }

    @Override
    public void supprimerPaiementById(Long idPaiement) {
        paiementRepository.deleteById(idPaiement);
    }
}
