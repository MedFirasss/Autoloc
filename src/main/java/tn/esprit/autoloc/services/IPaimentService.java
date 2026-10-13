package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Paiement;
import java.util.List;

public interface IPaimentService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    List<Paiement> consulterPaiement();
    Paiement consulterPaiementById(Long idPaiement);
    void supprimerPaiementById(Long idPaiement);
}