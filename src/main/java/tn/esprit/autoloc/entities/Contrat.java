package tn.esprit.autoloc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "contrat")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idContrat;
     LocalDate dateSignature;
     BigDecimal montantTotal;
     boolean valide;

    @OneToOne(mappedBy = "contrat")
    Reservation reservation;

    @OneToMany(mappedBy = "contrat")
    Set<Paiement> paiements ;



}
