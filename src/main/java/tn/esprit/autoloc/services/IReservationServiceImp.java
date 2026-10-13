
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IReservationServiceImp implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> consulterReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation consulterReservationById(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void supprimerReservationById(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
